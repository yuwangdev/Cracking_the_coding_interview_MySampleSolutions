package Chapter16;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yuwang on 2016-05-24.
 */
public class ThreadsTest {

    @Test
    public void testRun() throws Exception {

        Threads threads = new Threads();

        threads.run();

    }
}