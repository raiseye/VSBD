package com.vduty.example.demoMutiModul.domain;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class CallableWash implements Callable<Boolean>{

	public static AtomicInteger atomInt = new AtomicInteger(0);
	@Override
	public Boolean call() throws Exception {
		            System.out.println("闹钟");
        
        return true;
	}
	
	

}
