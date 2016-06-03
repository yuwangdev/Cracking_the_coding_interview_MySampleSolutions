package Chapter9;

import java.util.Hashtable;

/**
 * Created by yuwang on 5/31/16.
 * robots move from 0,0 to x,y, how many way? only allow right/down
 * there are some points that are not okay for move, find a path or false
 */

public class Two {


    private static int moveWay(int x, int y) {

        return factorial(x + y) / (factorial(x) * factorial(y));


    }

    private static int factorial(int i) {

        int[] cache = new int[i + 1];
        return factorial(i, cache);

    }

    private static int factorial(int i, int[] cache) {

        if (i == 0) cache[0] = 1;
        if (i == 1) cache[1] = 1;
        if (i == 2) cache[2] = 2;

        if (cache[i] > 0) return cache[i];

        cache[i] = factorial(i - 1, cache) * i;

        return cache[i];

    }


    private static Boolean findAPathToXY(int x, int y, Hashtable<Integer, Integer> okayPath) {

        // from the end back to start method

        // base case
        if (x == 0 && y == 0) {
            okayPath.put(x, y);
            return true;
        }

        Boolean isOkay = false;


        if (ifOkay(x - 1, y) && x > 0) {
            isOkay = findAPathToXY(x - 1, y, okayPath);
            if (isOkay) {
                System.out.println("x-1:y " + (x - 1) + "-" + y);
                //okayPath.put(x - 1, y);
            }
        }

        if (!isOkay && ifOkay(x, y - 1) && y > 0) {
            isOkay = findAPathToXY(x, y - 1, okayPath);
            if (isOkay) {
                System.out.println("x:y-1 " + x + "-" + (y - 1));
                // okayPath.put(x, y - 1);
            }
        }

        if (isOkay) {
            okayPath.put(x, y);
        }


        return isOkay;
    }

    private static boolean ifOkay(int i, int y) {

        return true;
    }


    public static void main(String[] argues) {

        System.out.println(moveWay(6, 8));

        Hashtable<Integer, Integer> okayPath = new Hashtable<>();
        System.out.println(findAPathToXY(6, 8, okayPath));
        System.out.println(okayPath);


    }


}
