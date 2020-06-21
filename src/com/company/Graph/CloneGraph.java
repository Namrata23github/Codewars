package com.company.Graph;

//https://leetcode.com/problems/clone-graph/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}


public class CloneGraph {
  public Node cloneGraph(Node node) {

    Queue<Node> queue = new LinkedList<>();
    Map<Integer,Node> containNode = new HashMap<>();
    queue.add(node);
    Node newNode = new Node();
    newNode.val = node.val;
    containNode.put(newNode.val,newNode);
    boolean[] visited = new boolean[101];
    visited[node.val] = true;


    while (!queue.isEmpty()){

      Node nodeFromQueue = queue.poll();
      Node nd = containNode.get(nodeFromQueue.val);
      ListIterator listIterator = nodeFromQueue.neighbors.listIterator();

      for (Node neighbor : nodeFromQueue.neighbors) {

        if(!visited[neighbor.val]){
          queue.add(neighbor);
          Node childNode = new Node();
          childNode.val = neighbor.val;
          nd.neighbors.add(childNode);
          containNode.put(childNode.val,childNode);
          visited[neighbor.val] = true;
        }else {
          nd.neighbors.add(  containNode.get(neighbor.val));
        }

      }

      //pop data

    }

    return newNode;

  }
  }


