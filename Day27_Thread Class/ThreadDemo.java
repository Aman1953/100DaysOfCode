class even extends Thread {
   public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println((2 * i)+" is even");
                sleep(500);
            }
        }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
class odd extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(((2 * i) - 1)+" is odd");

                sleep(500);
            }
        }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
public class ThreadDemo {
    public static void main(String[] args) {
        even e =new even();
        odd o = new odd();
        e.start();
        o.start();
    }
}
