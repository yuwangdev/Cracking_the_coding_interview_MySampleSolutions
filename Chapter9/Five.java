package Chapter9;

import java.util.ArrayList;

/**
 * Created by yuwang on 2016-06-02.
 * generate all possible lineup of a string
 */
public class Five {

    private static ArrayList<String> allStrings(String str) {

        if (str == null) {
            return null;
        }

        if (str.length() == 0) {

            ArrayList<String> result = new ArrayList<>();
            result.add("");
            return result;
        }


        ArrayList<String> result = new ArrayList<>();

        char newCharacter = str.charAt(0);

        ArrayList<String> previousResult = allStrings(str.substring(1));

        for (String item : previousResult) {


            for (int i = 0; i <= item.length(); i++) {    // because the newletter needs to be inserted before and after the word, so i<=length
                String newItem = insertAtPosition(newCharacter, item, i);
                result.add(newItem);

            }


        }


        return result;
    }

    private static String insertAtPosition(char newCharacter, String item, int i) {

        return item.substring(0, i) + newCharacter + item.substring(i);


    }


    public static void main(String[] argues) {


        ArrayList<String> result = allStrings("abcjk");

        System.out.println(result);

    }


}
