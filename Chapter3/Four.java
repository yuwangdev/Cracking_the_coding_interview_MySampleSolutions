package Chapter3;

/**
 * Created by yuwang on 5/17/16.
 * Hanoi tower
 */
public class Four {

    public static void main(String[] argus) {

        int NUMBER = 3;

        Tower[] towers = new Tower[3];

        for (int i = 2; i >= 0; i--) towers[i] = new Tower();

        for (int i = NUMBER - 1; i >= 0; i--) towers[0].addDisk(i);

        towers[0].solve(NUMBER, towers[1], towers[2]);


    }


}






