package com.derekcode;

import java.util.HashMap;

public class Jlogger {
	
	private static final String div = " : ";
	private String logFileName = "";
	private StringBuilder s = new StringBuilder();
	private MsgWriter writer = null;

	public Jlogger(int mode, String fileName){
		if (mode == 1 && (fileName == null || "".equals(fileName))){
			writer = new FileMsgWriter("./jlog.log");
		} else if (mode == 1){
			writer = new FileMsgWriter(fileName);
		} else {
			writer = new ConsoleMsgWriter();
		}
	}

	public Jlogger(){
		Jlogger(0, "");
	}
	
	public void log(LogLevel level, String msg, long ntime, String stime){
		s.setLength(1);
		s.append(level.toString())
			.append(div)
			.append(msg)
			.append(div)
			.append(sTime);
		writeToBuffer(s.toString());
		writer.start();
	}
}