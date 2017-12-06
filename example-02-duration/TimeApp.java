import java.util.Scanner;

public class TimeApp
{
    
    public void run() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Length of video (in minutes)? ");
        int mins = keyboard.nextInt(); 
        
        Duration origDur = new Duration(mins);
        
        System.out.print("Playback rate? ");
        double playbackRate = keyboard.nextDouble();
        
        Duration modDur = origDur.playAt(playbackRate);
        
        System.out.printf("The original duration of the video is %s%n", origDur);
        System.out.printf("At the given playback rate, the duration of the video will be %s%n", modDur);
        
    }
}
