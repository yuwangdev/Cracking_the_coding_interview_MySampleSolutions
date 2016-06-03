package Chapter1;

/**
 * Created by yuwang on 5/11/16.
 * check if two strings are mirror, assues given isSubstring method
 */
public class Eight {


    public static boolean isPermutationOnOneLetter(String str1, String str2) {

        if (str1.length() != str2.length()) return false;

        return isSubstring(str1 + str1, str2);

    }

    public static Boolean isSubstring(String longer, String shorter) {

        if (longer == null || shorter == null) return true;
        if (longer.equalsIgnoreCase(shorter)) return true;

        return longer.toLowerCase().contains(shorter.toLowerCase());

    }


    public static void main(String[] argus) {

        String test1 = "basketball";
        String test2 = "allbasketb";
        String test3 = "allbasketa";


        System.out.println(isPermutationOnOneLetter(test1, test2));
        System.out.println(isPermutationOnOneLetter(test1, test3));


    }


}



