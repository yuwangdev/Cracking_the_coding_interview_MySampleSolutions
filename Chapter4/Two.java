package Chapter4;

import java.util.LinkedList;


/**
 * Created by yuwang on 2016-05-19.
 * check if there is a path from the starting point to a target point in a graph
 */
public class Two {

    private static boolean ifPathExisted(Graph graph, Node start, int target) {

        if (graph == null || start == null) return false;

        LinkedList<Node> queue = new LinkedList<>();

        for (Node node : graph.getNodes()) {
            node.sate = State.unvisited;
        }

        start.sate = State.visiting;
        queue.add(start);

        while (!queue.isEmpty()) {

            Node temp = queue.pop();
            temp.sate = State.visited;

            if (temp.data == target) return true;

            for (Node node : temp.getAdjacent()) {
                if (node.data == target) return true;
                node.sate = State.visiting;
                queue.add(node);
            }

        }

        return false;

    }


    public static void main(String argus[]) {

        Graph graph = new Graph();
        int target = 5;
        Node startNode = new Node("", 2);

        System.out.println(ifPathExisted(graph, startNode, target));


    }


}
