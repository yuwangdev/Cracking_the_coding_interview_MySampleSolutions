package Chapter4;

/**
 * Created by yuwang on 2016-05-19.
 * check if a tree is a BST
 */
public class Five {

    private static boolean isBST(Tree node) {

        if (node == null) return false;

        return isBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE);

    }

    private static boolean isBST(Tree node, int minValue, int maxValue) {

        if (node == null) return false;

        if (node.data < minValue || node.data > maxValue) return false;

        return isBST(node.left, minValue, node.data) && isBST(node.right, node.data, maxValue);


    }


    public static void main(String argus[]) {

        Tree node = new Tree(1);
        Tree node1 = new Tree(1);
        Tree node2 = new Tree(2);
        Tree node3 = new Tree(3);
        Tree node4 = new Tree(4);
        Tree node5 = new Tree(5);
        Tree node6 = new Tree(6);
        Tree node7 = new Tree(7);

        node.left = node1;
        node.right = node2;

        node1.left = node3;
        node1.right = node4;

        node2.left = node5;
        node2.right = node6;
        node6.left = node7;

        printTree(node);

        System.out.println(isBST(node));


    }


    private static void printTree(Tree node) {

        if (node == null) return;
        System.out.println(node.toString());
        //System.out.println(node.data);
        printTree(node.left);
        printTree(node.right);

    }
}
