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

	public log(Integer level,  String msg){
		if (mode == 0){
			logToConsole(msg);
		} else {
			logToFile(msg);
		}
	}

	private void logToFile(){
		try{

		}catch(Exception e){

		}
	}

	private void logToConsole(){

	}

	public void setMode(int mode){
		int prevMode = this.mode;
		this.mode = (mode == 0 || mode == 1) ? mode : this.mode; 
	}

	public void setMode(boolean humanReadable){
		this.humanReadable = humanReadable;
	}
	

}

private enum 