package Chapter11;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;

/**
 * Created by yuwang on 2016-06-02.
 * sort a string[], put all anagram together
 */
public class Two {

    private static String[] sort_methodA(String[] stringArray) {
        AnagramComparator anagramComparator = new AnagramComparator();
        Arrays.sort(stringArray, anagramComparator);
        return stringArray;

    }

    private static String[] sort_methodB(String[] test) {

        Hashtable<String, LinkedList<String>> hashtable = new Hashtable<>();

        for (int i = 0; i < test.length; i++) {

            char[] charArrayAsKey = test[i].toCharArray();
            Arrays.sort(charArrayAsKey);
            String key = new String(charArrayAsKey);

            if (!hashtable.contains(key)) {

                hashtable.put(key, new LinkedList<>());

            }

            LinkedList<String> anagramOfThisKey = hashtable.get(key);
            anagramOfThisKey.add(test[i]);

        }

        String[] result = new String[hashtable.size()];

        int index = 0;

        for (String key : hashtable.keySet()) {

            LinkedList<String> temp = hashtable.get(key);

            for (int i = 0; i < temp.size(); i++) {
                result[index++] = temp.get(i);
            }

        }

        return result;

    }


    public static void main(String[] argues) {

        String[] test = {"apple", "trip", "banada", "iprt", "mac", "leppa"};
        String[] result = sort_methodA(test);
        String[] result1 = sort_methodB(test);


        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");

        }

        System.out.println();

        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");

        }
    }
}
