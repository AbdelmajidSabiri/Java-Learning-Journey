import java.util.Timer;
import java.util.TimerTask;

public class TimerExample {

    public static void main(String[] args) {
        
        Timer timer = new Timer();

        final int repetitions = 10;
        final int[] counter = {0}; // Use array because we can't use normal variable int (like python hh)

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (counter[0] <= repetitions) {
                    System.out.println(counter[0]);
                    counter[0]++;
                } else {
                    timer.cancel();
                    System.out.println("ISKAWATCHA HH");
                }
            }
        }, 0, 1000);  // Initial delay of 0s, repeat every 1s
    }
}
