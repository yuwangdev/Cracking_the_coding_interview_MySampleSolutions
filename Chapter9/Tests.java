package Chapter9;

import java.util.ArrayList;

/**
 * Created by yuwang on 2016-06-02.
 */
public class Tests {




    public static void main(String[] argus){

        ArrayList<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);



        ArrayList<Integer> a = new ArrayList<>();
        a.add(11);
        a.add(21);
        a.add(31);
        a.add(41);
        a.add(51);

        test.addAll(a);

        System.out.println(test);






    }
}
