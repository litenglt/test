package com.base.concurrent;

import java.util.concurrent.locks.LockSupport;

public class WaitOrNotify {
	
	//×èÈû
	public void await(){
		LockSupport.park();
	}
	
	//»½ÐÑ
	public void wake(Thread thread){
		LockSupport.unpark(thread);
	}
	
}
