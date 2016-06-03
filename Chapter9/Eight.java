package Chapter9;

/**
 * Created by yuwang on 2016-06-02.
 * how many does n cents have the way? including 1, 5, 10 and 25
 */
public class Eight {

    private static int allCents(int n) {
        return allCents(n, 25);
    }

    private static int allCents(int n, int cent) {

        if (cent == 1) return 1;  // base case

        int nextCent = 0;
        switch (cent) {
            case 25:
                nextCent = 10;
                break;

            case 10:
                nextCent = 5;
                break;

            case 5:
                nextCent = 1;
                break;

        }

        int result = 0;

        for (int i = 0; i * cent <= n; i++) {
            System.out.println(n - i * cent + " "+ nextCent);

            result += allCents(n - i * cent, nextCent);
        }
        return result;

    }

    public static void main(String[] argus) {
        System.out.println(allCents(100));

    }


}
