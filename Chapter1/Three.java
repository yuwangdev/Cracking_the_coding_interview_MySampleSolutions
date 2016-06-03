package Chapter1;

import java.util.Arrays;

/**
 * Created by yuwang on 5/10/16.
 */
public class Three {

    public static Boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        int[] temp = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            int position = str1.charAt(i);
            temp[position]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            int position = str2.charAt(i);
            temp[position]--;
            if (temp[position] < 0) return false;

        }

        return true;


    }


    public static Boolean isAnagram2(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        char[] charStr1 = str1.toCharArray();
        char[] charStr2 = str2.toCharArray();

        Arrays.sort(charStr1);
        Arrays.sort(charStr2);

        str1 = new String(charStr1);
        str2 = new String(charStr2);

        return str1.equals(str2);


    }


    public static void main(String[] argus) {


        System.out.println(isAnagram("Aabcdefg0", "Aabcedf0g"));
        System.out.println(isAnagram("Aabcdefg0", "Aabcdefg0"));
        System.out.println(isAnagram("Aabcdefu0", "Aabcdefg0"));

        System.out.println(isAnagram2("Aabcdefg0", "Aabcedf0g"));
        System.out.println(isAnagram2("Aabcdefg0", "Aabcdefg0"));
        System.out.println(isAnagram2("Aabcdefu0", "Aabcdefg0"));


    }
}
