package Graph;

import Graph.Graph.Node;
import java.util.HashSet;

public class DepthFirstSearch {
    public static boolean hasPathDFS (Node source, Node destination, HashSet<Integer> visited){
        if (visited.contains(source.id)) return false;
        visited.add(source.id);
        if (source == destination){
            return true;
        }
        for (Node node : source.nexts){
            if (hasPathDFS(node, destination, visited)) return true;
        }
        return false;
    }
}
