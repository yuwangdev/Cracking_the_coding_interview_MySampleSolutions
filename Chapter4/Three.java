package Chapter4;

import java.util.Arrays;

/**
 * Created by yuwang on 2016-05-19.
 * convert an array to a almost balanced BST
 */
public class Three {


    private static Tree convertToBST(int[] array, int start, int end) {

        if (array == null) return null;

        if (start > end) return null;

        int mid = (start + end) / 2;

        Tree tree = new Tree(array[mid]);
        tree.left = convertToBST(array, 0, mid - 1);
        tree.right = convertToBST(array, mid + 1, end);
        return tree;


    }


    public static void main(String argus[]) {

        int[] array = new int[10];

        for (int i = 9; i >= 0; i--) array[9 - i] = i;
        Arrays.sort(array);

        Tree node = convertToBST(array, 0, array.length - 1);

        printTree(node);

    }

    private static void printTree(Tree node) {

        if (node == null) return;
        System.out.println(node.toString());
        //System.out.println(node.data);
        printTree(node.left);
        printTree(node.right);

    }


}
