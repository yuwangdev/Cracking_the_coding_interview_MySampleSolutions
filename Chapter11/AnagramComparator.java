package Chapter11;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by yuwang on 2016-06-02.
 */
public class AnagramComparator implements Comparator<String> {

    private static String preSort(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);

    }


    @Override
    public int compare(String o1, String o2) {
        return preSort(o1).compareTo(preSort(o2));
    }
}
