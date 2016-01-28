package sbs20.filenotes.model;

import sbs20.filenotes.FilenotesApplication;

public class Logger {

    private static final String VERBOSE = "Verbose";
    private static final String DEBUG = "Debug";
    private static final String INFORMATION = "Info";
    private static final String WARN = "Warn";
    private static final String ERROR = "Error";

    private FilenotesApplication application;

    public Logger(FilenotesApplication application) {
        this.application = application;
    }

    private void log(String level, String tag, String msg) {
        // TODO - write somewhere better
        this.application.toast(level + ":" + tag + ":" + msg);
    }

    public void verbose(String tag, String msg) {
        this.log(VERBOSE, tag, msg);
    }
    public void debug(String tag, String msg) {
        this.log(DEBUG, tag, msg);
    }
    public void info(String tag, String msg) {
        this.log(INFORMATION, tag, msg);
    }
    public void warn(String tag, String msg) {
        this.log(WARN, tag, msg);
    }
    public void error(String tag, String msg) {
        this.log(ERROR, tag, msg);
    }

    public void verbose(Object source, String msg) {
        this.log(VERBOSE, source.getClass().getName(), msg);
    }
    public void debug(Object source, String msg) {
        this.log(DEBUG, source.getClass().getName(), msg);
    }
    public void info(Object source, String msg) {
        this.log(INFORMATION, source.getClass().getName(), msg);
    }
    public void warn(Object source, String msg) {
        this.log(WARN, source.getClass().getName(), msg);
    }
    public void error(Object source, String msg) {
        this.log(ERROR, source.getClass().getName(), msg);
    }
}