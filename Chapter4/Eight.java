package Chapter4;

/**
 * Created by yuwang on 5/19/16.
 * check if a small tree is entirely in a big tree
 */
public class Eight {


    private static boolean isSubTree(Tree bigTree, Tree smallTree) {


        if (smallTree == null) return true;

        if (bigTree == null) return false;

        if (bigTree.data == smallTree.data) {

            if (identical(bigTree, smallTree)) return true;

        }

        if (isSubTree(bigTree.left, smallTree) || isSubTree(bigTree.right, smallTree))
            return true;


        return false;


    }

    private static boolean identical(Tree tree1, Tree tree2) {

        if (tree1 == null && tree2 == null) return true;

        if (tree1 == null || tree2 == null) return false;

        if (tree1.data != tree2.data) return false;

        return identical(tree1.left, tree2.left) && identical(tree1.right, tree2.right);
    }


    public static void main(String argus[]) {

        Tree bigTree = new Tree(5);
        Tree smallTree = new Tree(4);

        System.out.println(isSubTree(bigTree, smallTree));


    }


}