package Chapter4;

/**
 * Created by yuwang on 2016-05-19.
 */
public class Tree {

    int data;
    Tree left = null;
    Tree right = null;
    Tree parent = null;

    public Tree(int data) {
        this.data = data;

    }

    @Override
    public String toString() {
        String left = this.left == null ? "null" : Integer.toString(this.left.data);
        String right = this.right == null ? "null" : Integer.toString(this.right.data);
        return Integer.toString(this.data) + " <<" + left + " >>" + right;

    }


}

