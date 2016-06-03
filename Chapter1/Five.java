package Chapter1;

/**
 * Created by yuwang on 5/10/16.
 * compress: aaabbcc becomes a3b2c2, if new one is longer, return the older
 */
public class Five {

    public static String compress(String str) {
        if (str == null || str.length() == 0) return null;
        if (str.length() == 1) return str;

        StringBuilder sb = new StringBuilder();

        int count = 1;
        char last = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) != last) {

                sb.append(last);
                sb.append(count);
                last = str.charAt(i);
                count = 1;

            } else {

                count++;

            }

        }

        sb.append(last);
        sb.append(count);

        return sb.toString().length() >= str.length() ? str : sb.toString();

    }


    public static void main(String[] argus) {

        String test1 = "aaabbccc";
        String test2 = "abcd";
        String test3 = "aaabbcccd";


        System.out.println(compress(test1));
        System.out.println(compress(test2));
        System.out.println(compress(test3));


    }

}
