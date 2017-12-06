public class TallyCounter
{
    private int tally;
    private String name;
    
    public TallyCounter(String name) {
        tally = 0;
        this.name = name;
    }

    public void press() {
        tally++;
    }
    
    public int reading() {
        return tally;
    }

    public void reset() {
        tally = 0;
    }

    public String toString() {
        return String.format("The tally on %s is %d.", name, tally);
    }
}
