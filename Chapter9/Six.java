package Chapter9;

import java.util.HashSet;

/**
 * Created by yuwang on 2016-06-02.
 * print all matchup of n pairs ()
 */
public class Six {


    private static HashSet<String> allMatchup(int n) {

        HashSet<String> result = new HashSet<>();

        if (n == 0) {

            result.add("");
            return result;

        }

        HashSet<String> previousResult = allMatchup(n - 1);

        for (String item : previousResult) {

            for (int i = 0; i < item.length(); i++) {

                if (item.charAt(i) == '(') {
                    String newItem = insert(item, i);
                    result.add(newItem);
                }


            }

            if (!result.contains("()" + item)) {
                result.add("()" + item);

            }


        }


        return result;
    }

    private static String insert(String item, int i) {

        return item.substring(0, i+1) + "()" + item.substring(i+1);


    }

    public static void main(String[] argus) {

        System.out.println(allMatchup(8));
        System.out.println(allMatchup(8).size());


    }


}
