package Chapter16;

/**
 * Created by yuwang on 2016-05-24.
 */
public class RunnableMethod implements Runnable {


    @Override
    public void run() {


        synchronized (this) {
            try {
                System.out.println("runnable thread starting before 1000");
                Thread.sleep(1000);
                System.out.println("runnable thread starting after 1000");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
