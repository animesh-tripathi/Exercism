public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.substring(logLine.indexOf(":")+1).trim();
    }

    public static String logLevel(String logLine) {
        return logLine.substring(1,logLine.lastIndexOf("]")).toLowerCase();
    }

    public static String reformat(String logLine) {
        return String.format(message(logLine)+" (%s)",logLevel(logLine));
    }
}
