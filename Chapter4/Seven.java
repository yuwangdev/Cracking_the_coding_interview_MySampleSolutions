package Chapter4;

/**
 * toDo
 * <p>
 * Created by yuwang on 5/19/16.
 * find the common parent of two nodes in a tree
 */
public class Seven {


    private static Tree findCommonParent(Tree node, Tree node1, Tree node2) {

        if (!isInTree(node1, node) || !isInTree(node2, node)) return null;

        return solver(node, node1, node2);

    }

    private static Tree solver(Tree node, Tree node1, Tree node2) {

        // if node1 and node2 are at different side of node, if yes, return node
        // otherwise, recursion with the UPDATED node as the root again

        if (node1 == null || node2 == null || node == null) return null;

        Boolean node1AtLeft = isInTree(node1, node.left);
        Boolean node2AtLeft = isInTree(node2, node.left);

        if (node1AtLeft != node2AtLeft) return node;

        // updated the new tree root for the upcoming recursion
        Tree newRoot = node1AtLeft == true ? node.left : node.right;

        return solver(newRoot, node1, node2);


    }

    private static boolean isInTree(Tree node, Tree tree) {

        if (node == null || tree == null) return false;

        if (node.data == tree.data) return true;

        if (node.data != tree.data) {

            return isInTree(node, tree.left) || isInTree(node, tree.right);
        }

        return false;

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

        System.out.println(findCommonParent(node, node4, node5));


    }


}
