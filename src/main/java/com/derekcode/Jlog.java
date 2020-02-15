package com.derekcode;

import java.time.LocalDateTime;

public class Jlog {

	private int mode = 0;
	private boolean humanReadable = false;
	private String fileName = "";

	public Jlog(int mode, boolean humanReadable, fileName){
		this.mode = mode == null ? 1 : mode;
		this.humanReadable = humanReadable;
		setFileName(fileName);
	}

	public log(LogLevel level,  String msg){
		if (mode == 0){
			logToConsole(level, msg);
		} else {
			logToFile(level, msg);
		}
	}

	public void setMode(int mode){
		int prevMode = this.mode;
		this.mode = (mode == 0 || mode == 1) ? mode : this.mode; 
	}

	public void setMode(boolean humanReadable){
		this.humanReadable = humanReadable;
	}
	

}