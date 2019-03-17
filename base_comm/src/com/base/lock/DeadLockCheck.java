package com.base.lock;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 *À¿À¯ºÏ≤È
 * @author Administrator
 *
 */
public class DeadLockCheck {
	private final static ThreadMXBean mbean=ManagementFactory.getThreadMXBean();
	final static Runnable deadLockCheck=new Runnable(){

		@Override
		public void run() {
			while(true){
				long[] deadlockedThreads=mbean.findDeadlockedThreads();
				if(deadlockedThreads!=null){
					ThreadInfo[] threadInfos=mbean.getThreadInfo(deadlockedThreads);
					for(Thread t : Thread.getAllStackTraces().keySet()){
						for(int i=0;i<threadInfos.length;i++){
							if(t.getId()==threadInfos[i].getThreadId()){
								t.interrupt();
							}
						}
					}
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}
		
	};
	
	public static void check(){
		Thread t=new Thread(deadLockCheck);
		t.setDaemon(true);
		t.start();
	}
}
