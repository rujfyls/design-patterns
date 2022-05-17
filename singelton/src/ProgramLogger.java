public class ProgramLogger {
    private static volatile ProgramLogger programLogger;
    private static String logfile = "This is log file...";

    private ProgramLogger() {
    }

    public static ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            synchronized (ProgramLogger.class) {
                if (programLogger == null) {
                    programLogger = new ProgramLogger();
                }
            }
        }
        return programLogger;
    }

    public void addLogInfo(String logInfo) {
        logfile += logInfo;
    }

    public String getLogfile() {
        return logfile;
    }

}
