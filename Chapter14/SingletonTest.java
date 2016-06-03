package Chapter14;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yuwang on 2016-05-24.
 */
public class SingletonTest {

    @Test
    public void testGetSingleton() throws Exception {

        Singleton singleton = Singleton.getSingleton();
        singleton.doSth();


    }


}