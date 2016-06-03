package Chapter4;

/**
 * <p>
 * Created by yuwang on 5/19/16.
 * find the next node for visiting, in a mid-order loop
 */
public class Six {

    private static Tree nextNodeForVisiting(Tree node) {

        // if this node has right, return the leftest node of right
        // otherwise, go up to "parent". if this parent's the left == this node, return this parent
        //            if not again, if the parent's parent is null, return null
        //            if still not, go to the highest root, return this root
        //

        if (node == null) return null;

        if (node.right != null) {
            return theLeftestNode(node.right);
        }

        Tree temp = node; // for cut off any linkage, since the variable is by reference
        Tree parent = node.parent;

        while (parent != null && parent.left != node) {

            temp = parent;
            parent = parent.parent;


        }

        return parent;


    }

    private static Tree theLeftestNode(Tree tree) {

        if (tree == null) return null;

        while (tree != null) {

            tree = tree.left;
        }

        return tree;


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

        System.out.println(nextNodeForVisiting(node));
        System.out.println(nextNodeForVisiting(node2));

    }


}
