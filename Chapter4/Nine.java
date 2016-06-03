package Chapter4;

/**
 * Created by yuwang on 5/19/16.
 * find a path that sum up to a given integer
 */
public class Nine {


    private static void obtainList(Tree tree, int target, int[] path, int level) {


        if (tree == null) return;

        path[level] = tree.data;

        int tempSum = 0;

        for (int i = level; i >= 0; i--) {

            tempSum += path[i];

            if (tempSum == target)
                for (int j = i; j >= 0; j--) {
                    System.out.print(path[j] + " ");

                }


        }

        obtainList(tree.left, target, path, level + 1);
        obtainList(tree.right, target, path, level + 1);


    }


    public static void main(String argus[]) {

        Tree node = new Tree(100);
        Tree node1 = new Tree(1);
        Tree node2 = new Tree(2);
        Tree node3 = new Tree(3);
        Tree node4 = new Tree(4);
        Tree node5 = new Tree(5);
        Tree node6 = new Tree(6);
        Tree node7 = new Tree(7);

        node.left = node1;
        node1.parent = node;

        node.right = node2;
        node2.parent = node;

        node1.left = node3;
        node3.parent = node1;

        node1.right = node4;
        node4.parent = node1;

        node2.left = node5;
        node5.parent = node2;

        node2.right = node6;
        node6.parent = node2;

        node6.left = node7;
        node7.parent = node6;

        printTree(node);

        System.out.println("-----");

        int[] array = new int[height(node)];

        obtainList(node, 105, array, 0);


    }

    private static int height(Tree node) {

        if (node == null) return 0;

        return Math.max(height(node.left), height(node.right)) + 1;


    }


    private static void printTree(Tree node) {

        if (node == null) return;
        System.out.println(node.toString());
        //System.out.println(node.data);
        printTree(node.left);
        printTree(node.right);

    }


}



