package Chapter16;

import java.util.concurrent.locks.Lock;

/**
 * Created by yuwang on 5/19/16.
 */
public class Threads extends Thread {


    public void run() {


        try {
            System.out.println("thread starting before 1000");
            Thread.sleep(1000);
            System.out.println("thread starting after 1000");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
