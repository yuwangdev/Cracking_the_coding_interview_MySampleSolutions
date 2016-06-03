package Chapter16;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yuwang on 2016-05-24.
 */
public class RunnableMethodTest {

    @Test
    public void testRun() throws Exception {

        RunnableMethod runnableMethod = new RunnableMethod();

        Thread thread = new Thread(runnableMethod);
        thread.run();

    }
}