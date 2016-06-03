package Chapter4;

import java.util.LinkedList;

/**
 * Created by yuwang on 2016-05-19.
 * return a list cotaining every level of nodes in a tree
 * Methods: applying the
 */
public class Four {

    private static LinkedList<LinkedList<Integer>> obtianListPerLevel(Tree node) {

        LinkedList<LinkedList<Integer>> results = new LinkedList<>();

        if (node == null) return null;

        LinkedList<Integer> current = new LinkedList<>();

        current.add(node.data);
        results.add(current);
        current = new LinkedList<>();

        LinkedList<Tree> parents = new LinkedList<>();
        parents.add(node);


        while (parents.size() != 0) {

            LinkedList<Tree> temp = new LinkedList<>();

            for (Tree tree : parents) {
                if (tree.left != null) {
                    temp.add(tree.left);
                    current.add(tree.left.data);
                }
                if (tree.right != null) {
                    temp.add(tree.right);
                    current.add(tree.right.data);
                }

            }

            parents = temp;
            results.add(current);

            current = new LinkedList<>();


        }


        return results;
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
        node.right = node2;

        node1.left = node3;
        node1.right = node4;

        node2.left = node5;
        node2.right = node6;
        node6.left = node7;

        printTree(node);

        System.out.println("-----");

        LinkedList<LinkedList<Integer>> linkedList = obtianListPerLevel(node);


        for (LinkedList<Integer> entry : linkedList) {

            for (Integer item : entry) {

                System.out.print(item + " , ");

            }

            System.out.println(" ");

        }


    }


    private static void printTree(Tree node) {

        if (node == null) return;
        System.out.println(node.toString());
        //System.out.println(node.data);
        printTree(node.left);
        printTree(node.right);

    }
}
