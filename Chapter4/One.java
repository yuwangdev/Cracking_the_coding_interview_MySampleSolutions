package Chapter4;

/**
 * Created by yuwang on 5/17/16.
 * check if a tree is balanced by <=1 difference
 */
public class One {

    private static boolean isBalanced(Tree node) {

        if (node == null) return true;

        if (Math.abs(height(node.left) - height(node.right)) > 1) return false;

        return isBalanced(node.left) && isBalanced(node.right);

    }

    public static int height(Tree node) {

        if (node == null) return 0;

        return Math.max(height(node.left), height(node.right)) + 1;


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

        System.out.println(isBalanced(node));
        System.out.println(height(node));


    }


    private static void printTree(Tree node) {

        if (node == null) return;
        System.out.println(node.toString());
        //System.out.println(node.data);
        printTree(node.left);
        printTree(node.right);

    }


}
