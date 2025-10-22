package Miia;
//import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class TimerFraga {
    public static void main(String[] args) {
        
        //Scanner scanner = new Scanner (System.in);
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
        
            @Override
            public void run() {
                //kod som byter fråga
            } 
        };

        timer.schedule(task, 6000);
        timer.cancel();
    }
    
}
