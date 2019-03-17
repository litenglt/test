package com.base.lock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ¿ÉÖÐ¶ÏËø
 * 
 * @author Administrator
 *
 */
public class ReentenstLockTest implements Runnable {
	public static ReentrantLock lock = new ReentrantLock();
	public static int i = 0;

	@Override
	public void run() {
		// lock.lock();
		//lock.tryLock(5,TimeUnit.SECONDS);
		try {
			lock.lockInterruptibly();
			for (int j = 0; j < 10000000; j++) {
				i++;

			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (lock.isHeldByCurrentThread()) {
				lock.unlock();
			}

		}

	}

	public static void main(String[] args) throws InterruptedException {
		ReentenstLockTest ret = new ReentenstLockTest();
		Thread th = new Thread(ret);
		Thread th1 = new Thread(ret);
		th.start();
		th1.start();
		th.join();
		th1.join();
		System.out.println(i);
	}
}
