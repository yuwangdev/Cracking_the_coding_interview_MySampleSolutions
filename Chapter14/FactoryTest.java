package Chapter14;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yuwang on 2016-05-24.
 */
public class FactoryTest {

    @Test
    public void testGetShape() throws Exception {

        Factory factory = new Factory();

        factory.getShape("circle");
        factory.getShape("rect");


    }
}