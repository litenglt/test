package com.base.idIdentify;

import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

public class IdGenerator {
	private final static long beginTs = 1483200000000L;
	 
	private long lastTs = 0L;
 
	private long processId;
	private int processIdBits = 10;
 
	private long sequence = 0L;
	private int sequenceBits = 12;
 
	// 10λ����ID��ʶ
	public IdGenerator(long processId) {
		if (processId > ((1 << processIdBits) - 1)) {
			throw new RuntimeException("����ID������Χ������λ��" + processIdBits + "�����"
					+ ((1 << processIdBits) - 1));
		}
		this.processId = processId;
	}
 
	protected long timeGen() {
		return System.currentTimeMillis();
	}
 
	public synchronized long nextId() {
		long ts = timeGen();
		if (ts < lastTs) {// �ո����ɵ�ʱ������ϴε�ʱ�����С������
			throw new RuntimeException("ʱ���˳�����");
		}
		if (ts == lastTs) {// �ո����ɵ�ʱ������ϴε�ʱ���һ��������Ҫ����һ��sequence���к�
			// sequenceѭ������
			sequence = (sequence + 1) & ((1 << sequenceBits) - 1);
			// ���sequence=0����Ҫ��������ʱ���
			if (sequence == 0) {
				// �ұ��뱣֤ʱ�����������
				ts = nextTs(lastTs);
			}
		} else {// ���ts>lastTs��ʱ��������Ѿ���ͬ�ˣ���ʱ���Բ�������sequence�ˣ�ֱ��ȡ0
			sequence = 0L;
		}
		lastTs = ts;// ����lastTsʱ���
		return ((ts - beginTs) << (processIdBits + sequenceBits)) | (processId << sequenceBits)
				| sequence;
	}
 
	protected long nextTs(long lastTs) {
		long ts = timeGen();
		while (ts <= lastTs) {
			ts = timeGen();
		}
		return ts;
	}
 
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		IdGenerator ig = new IdGenerator(1023);
		String str = "20170101";
		System.out.println(new SimpleDateFormat("YYYYMMDD").parse(str).getTime());
		Set<Long> set = new HashSet<Long>();
		long begin = System.nanoTime();
		for (int i = 0; i < 10; i++) {
			set.add(ig.nextId());
		}
		System.out.println("time=" + (System.nanoTime() - begin)/1000.0 + " us");
		System.out.println(set.size());
		System.out.println(set);
	}
}
