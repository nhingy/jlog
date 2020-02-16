package com.derekcode;

import java.time.LocalDateTime;

public class Jlog {

	private int mode = 0;
	private boolean humanReadable = false;
	private Jlogger jlogger = new Jlogger();

	public Jlog(){
		Jlog(0, false, "");
	}

	public Jlog(int mode, boolean humanReadable, String fileName){
		this.mode = mode == null ? 1 : mode;
		this.humanReadable = humanReadable;
		setFileName(fileName);
	}

	public void log(LogLevel level,  String msg){
		String time = !humanReadable ? String.valueOf(System.currentTimeMillis()) 
			: LocalDateTime.ofEpochSecond(Instant.now(), ZoneId.systemDefault()).toString();
		jlogger.log(level, msg, time);
	}

	public void setMode(int mode){
		int prevMode = this.mode;
		this.mode = (mode == 0 || mode == 1) ? mode : this.mode; 
		if (prevMode != mode){
			jlogger.notifyModeChange(mode);
		} 
	}

	public void setHumanReadable(boolean humanReadable){
		this.humanReadable = humanReadable;
	}
	

}