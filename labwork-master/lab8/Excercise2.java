package lab8;
import java.util.Date;


class TimerDisplay implements Runnable {
	
	public void run() {
		for( ;  ;  ) {
			try {
				Date d = new Date();
				System.out.println(d);
				Thread.sleep(10000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Excercise2 {

	public static void main(String[] args) {
		
		TimerDisplay td = new TimerDisplay();
		Thread t = new Thread(td);
		t.start();

	}

}