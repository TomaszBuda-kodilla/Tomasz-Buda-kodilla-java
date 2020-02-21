package com.kodilla.patterns.singleton;

public final class Logger {
    private static Logger loggingEngine = null;
    private String lastLog = "";

    public static Logger getInstance(){
        if(loggingEngine == null){
            synchronized (Logger.class){
                if(loggingEngine == null){
                    loggingEngine = new Logger();
                }
            }
        }
        return loggingEngine;
    }

    public void log(final String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}