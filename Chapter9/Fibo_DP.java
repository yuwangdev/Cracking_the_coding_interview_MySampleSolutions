package Chapter9;

/**
 * Created by yuwang on 2016-05-25.
 */
public class Fibo_DP {

//    private static int fibo(int n) {
//
//        if (n == 0) return 0;
//        if (n == 1) return 1;
//        if (n == 2) return 3;
//
//        int[] results = new int[n + 1];
//
//        results[0] = 0;
//        results[1] = 1;
//        results[2] = 3;
//
//        for (int i = 3; i <= n; i++) {
//
//            results[i] = results[i - 1] + results[i - 2];
//
//        }
//
//        return results[n];
//
//    }


    // a more formal Dynamic Programming style method
    private static int fibo(int n) {

        int[] cache = new int[n + 1];

        return fibo(n, cache);


    }

    private static int fibo(int n, int[] cache) {

        if (n == 0) cache[0] = 0;
        if (n == 1) cache[1] = 1;
        if (n == 2) cache[2] = 3;

        if (cache[n] > 0) return cache[n];

        if (n > 2) {
            cache[n] = fibo(n - 1, cache) + fibo(n - 2, cache);
        }

        return cache[n];


    }


    public static void main(String[] argus) {

        System.out.println(fibo(19));
        System.out.println(fibo(29));
        System.out.println(fibo(39));
        System.out.println(fibo(49));
        System.out.println(fibo(59));
        System.out.println(fibo(0));
        System.out.println(fibo(1));
        System.out.println(fibo(2));


    }


}
