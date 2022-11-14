class TableSyn {
    static synchronized void print() {
        int no = 0;
        try {
            for (int i = 0; i < 6; i++) {
                no++;
                System.out.print(no+"  ");
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
class FirstThread extends Thread{
    public void run()
    {
        TableSyn.print();
    }
}

class SecondThread extends Thread{
    public void run()
    {
        TableSyn.print();
    }
}
class ThirdThread extends Thread{
    public void run()
    {
        TableSyn.print();
    }
}
public class Synchronization {
    public static void main(String[] args) {
        FirstThread t1 = new FirstThread();
        SecondThread t2 = new SecondThread();
        ThirdThread t3 = new ThirdThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
