public class TallyApp {

    public void run() {
        TallyCounter telly = new TallyCounter("Telly");
        TallyCounter sally = new TallyCounter("Sally");

        telly.press();
        telly.press();

        sally.reset();

        System.out.println(telly);
        System.out.println(sally);

    }

}