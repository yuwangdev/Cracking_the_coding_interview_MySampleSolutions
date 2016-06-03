package Chapter11;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yuwang on 2016-06-02.
 */
public class ComparableCollectionTest {

    @Test
    public void testCompareTo() throws Exception {

        ComparableCollection comparableCollection = new ComparableCollection("fadsfasdfsd");
        System.out.println(comparableCollection.compareTo("sfsfd"));

    }
}