package Chapter9;

/**
 * Created by yuwang on 5/31/16.
 * climb the n stairs, can 1, 2 or 3 steps, how many ways?
 */
public class One {

    // recursion
//
//    private static int climbStairs(int n) {
//
//
//        if (n == 0) return 0;
//        if (n == 1) return 1;
//        if (n == 2) return 2;
//        if (n == 3) return 4;
//
//        return climbStairs(n - 1) + climbStairs(n - 2) + climbStairs(n - 3);
//
//    }

    // dp
    private static int climbStairs(int n) {

        int[] cache = new int[n + 1];
        return climbStairs(n, cache);


    }

    private static int climbStairs(int n, int[] cache) {

        if (n == 0) cache[0] = 0;
        if (n == 1) cache[1] = 1;
        if (n == 2) cache[2] = 2;
        if (n == 3) cache[3] = 4;

        if (cache[n] > 0) return cache[n];

        if (n > 3) {

            cache[n] = climbStairs(n - 1, cache) + climbStairs(n - 2, cache) + climbStairs(n - 3, cache);
        }
        return cache[n];

    }


    public static void main(String argus[]) {

        System.out.println(climbStairs(10));
        System.out.println(climbStairs(20));
        System.out.println(climbStairs(30));
        System.out.println(climbStairs(36));
        System.out.println(climbStairs(37));


    }


}
