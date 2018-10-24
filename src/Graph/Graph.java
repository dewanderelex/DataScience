package Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import Graph.DepthFirstSearch.*;
import Graph.BreadthFirstSearch.*;

public class Graph {
    public static class Node {
        public int id;
        LinkedList<Node> nexts = new LinkedList<>();

        public Node (int id) {
            this.id = id;
        }
    }

    private HashMap<Integer, Node> nodeLookUp = new HashMap<>();

    public Node getNode (int id){
        return nodeLookUp.get(id);
    }

    public void addEdge (int source, int destination){
        Node s = getNode(source);
        Node d = getNode(destination);
        s.nexts.add(d);
    }

    public boolean hasPathDFS (int source, int destination){
        Node s = getNode(source);
        Node d = getNode(destination);
        HashSet<Integer> visited = new HashSet<>();
        return DepthFirstSearch.hasPathDFS(s, d, visited);
    }

    public boolean hasPathBFS (int source, int destination){
        Node s = getNode(source);
        Node d = getNode(destination);
        return BreadthFirstSearch.hasPathBFS(s, d);
    }

}
