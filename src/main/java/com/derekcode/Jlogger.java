package com.derekcode;

public abstract class Jlogger {
	private HashMap<Long, String> msgs = new HashMap<Long, String>();
	public void log(int level, String msg){
		
	}
	public abstract void log(String msg);
}