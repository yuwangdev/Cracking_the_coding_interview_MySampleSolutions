package Chapter1;

/**
 * Created by yuwang on 5/10/16.
 * check if a string only contains unique character, assumes ASICII
 */
public class One {

    public static Boolean checkIfUnique(String str) {


        if (str.length() > 256) {
            return false;
        }

        Boolean[] temp = new Boolean[256];

        for (int i = 0; i < temp.length; i++) temp[i] = false;

        for (int i = 0; i < str.length(); i++) {
            int position = str.charAt(i);

            if (temp[position]) return false;
            temp[position] = true;

        }
        return true;

    }


    public static void main(String[] argus) {

        String test1 = "Aabcdefg0";
        String test2 = "aabbdsdfsdfdsfwe";

        System.out.println(checkIfUnique(test1));
        System.out.println(checkIfUnique(test2));


    }


}
