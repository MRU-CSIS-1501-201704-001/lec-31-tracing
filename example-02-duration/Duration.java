public class Duration
{
    private static final int HOURS_PER_MINUTE = 60;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final int SECONDS_PER_HOUR = 3600;
    
    private final int hours;
    private final int mins;
    private final int secs;
    
    public Duration(int hours, int mins, int secs) {
        this.hours = hours;
        this.mins = mins;
        this.secs = secs;
    }
    
    public Duration(int mins) {
        this.hours = mins / HOURS_PER_MINUTE;
        this.mins = mins % HOURS_PER_MINUTE;
        this.secs = 0;
    }
    
    public Duration playAt(double playbackRate) {
        int myTotalSecs = secs + (SECONDS_PER_MINUTE * mins) + (SECONDS_PER_HOUR * hours);

        int newDurTotalSecs = (int)(Math.round(myTotalSecs / playbackRate));

        int newDurHours = newDurTotalSecs / SECONDS_PER_HOUR;
        int newDurMins = (newDurTotalSecs % SECONDS_PER_HOUR) / SECONDS_PER_MINUTE;
        int newDirSecs = (newDurTotalSecs % SECONDS_PER_HOUR) % SECONDS_PER_MINUTE;

        return new Duration(newDurHours, newDurMins, newDirSecs);
    }
    
    @Override
    public String toString() {
        return String.format("%02dh:%02dm:%02ds", hours, mins, secs);

    }
}
