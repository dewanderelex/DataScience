package Graph;

import Graph.Graph.Node;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;


public class BreadthFirstSearch {
    public static boolean hasPathBFS (Node source, Node destination) {
        LinkedList<Node> queue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        queue.add(source);
        while (!queue.isEmpty()){
            Node node = queue.remove();
            if (node == destination){
                return true;
            }
            if (visited.contains(node)){
                continue;
            }
            visited.add(node.id);
            queue.addAll(node.nexts);
        }
        return false;
    }
}
