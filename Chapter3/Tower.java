package Chapter3;

import java.util.Stack;

/**
 * Created by yuwang on 5/17/16.
 */
public class Tower {

    private Stack<Integer> disks = null;

    public Tower() {
        disks = new Stack<Integer>();

    }

    public void addDisk(int i) {

        if (!this.disks.isEmpty()) {

            if (i > this.disks.peek()) throw new IllegalArgumentException();
        }

        this.disks.push(i);

    }

    public void solve(int n, Tower buffer, Tower destination) {

        if (n > 0) {
            solve(n - 1, destination, buffer);
            moveTheBottomFromOriginToDestination(destination);
            solve(n - 1, this, destination);
        }

    }

    private void moveTheBottomFromOriginToDestination(Tower destination) {

        int bottom = this.disks.pop();
        destination.addDisk(bottom);


    }


}
