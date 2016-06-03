package Chapter9;

/**
 * Created by yuwang on 2016-05-25.
 */
public class Fibo_Recursion {

    private static int fibo(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 3;

        return fibo(n - 1) + fibo(n - 2);


    }


    public static void main(String[] argus) {

        System.out.println(fibo(19));
        System.out.println(fibo(29));
        System.out.println(fibo(39));



    }


}
