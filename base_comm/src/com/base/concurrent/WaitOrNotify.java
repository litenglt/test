package com.base.concurrent;

import java.util.concurrent.locks.LockSupport;

public class WaitOrNotify {
	
	//����
	public void await(){
		LockSupport.park();
	}
	
	//����
	public void wake(Thread thread){
		LockSupport.unpark(thread);
	}
	
}
