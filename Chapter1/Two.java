package Chapter1;

/**
 * Created by yuwang on 5/10/16.
 * reverse a string
 */
public class Two {


    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();


    }


    public static void main(String[] argus) {

        String test1 = "Aabcdefg0";
        String test2 = "aabbdsdfsdfdsfwe";

        System.out.println(reverseString(test1));
        System.out.println(reverseString(test2));


    }


}
