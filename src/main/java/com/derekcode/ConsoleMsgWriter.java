package com.derekcode;

import java.util.concurrent.ArrayBlockingQueue;

public class ConsoleMsgWriter implements Runnable, MsgWriter {
	private ArrayBlockingQueue<String> msgQueue = new ArrayBlockingQueue<String>();
	public void passMsg(String msg){
		msgs.put
	}
	public void run(){
		for(Entry<Long, String> msg : msgs.entrySet()) {
			System.out.println(msg.getValue());
		}
	}
}