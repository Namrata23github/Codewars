package com.company.Graph;

import java.util.ArrayList;
import java.util.List;

public class MinimumVerticesReachAllNodes {

  public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {


    boolean nodeWithIncomingVertices[] = new boolean[n];
    edges.forEach(a -> {
      nodeWithIncomingVertices[a.get(1)] = true;
    });

    List<Integer> v = new ArrayList<>();

    for(int i= 0;i<n;i++){
      if(!nodeWithIncomingVertices[i]){
        v.add(i);
      }
    }

    return v;
  }
}
