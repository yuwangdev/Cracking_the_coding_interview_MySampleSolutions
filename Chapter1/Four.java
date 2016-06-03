package Chapter1;

/**
 * Created by yuwang on 5/10/16.
 * replace blank space by %20
 */
public class Four {

    public static char[] replaceSpace(char[] chars) {

        if (chars == null || chars.length == 0) return null;

        int previousLength = chars.length;

        int countSpace = 0;
        for (int i = 0; i < previousLength; i++) {

            if (chars[i] == ' ') countSpace++;

        }

        int newLength = previousLength + 2 * countSpace;

        char[] newChar = new char[newLength];


        for (int i = previousLength - 1; i >= 0; i--) {

            if (chars[i] != ' ') {
                newChar[newLength - 1] = chars[i];
                newLength--;
            }

            if (chars[i] == ' ') {
                newChar[newLength - 1] = '0';
                newChar[newLength - 2] = '2';
                newChar[newLength - 3] = '%';
                newLength -= 3;


            }

        }

        return newChar;

    }


    public static void main(String[] argus) {


        char[] test1 = "Aabcdefg0".toCharArray();
        char[] test2 = "A abcdefg0".toCharArray();
        char[] test3 = "A    abcdefg0".toCharArray();


        System.out.println(replaceSpace(test1));
        System.out.println(replaceSpace(test2));
        System.out.println(replaceSpace(test3));


    }

}
