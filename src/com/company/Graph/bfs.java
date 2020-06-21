package com.company.Graph;

import java.io.*;
import java.util.*;

public class bfs {

  // Complete the bfs function below.
  static int[]  bfs(int n, int m, int[][] edges, int s) {



    LinkedList<Integer>  adj [] = new LinkedList[n+1];
    //Build a graph
    for (int i=0; i< edges.length; i++){
      int one =  edges[i][0];
      int two =  edges[i][1];
      if(adj[one] == null){
        adj[one] = new LinkedList();
      }
      if(adj[two] == null){
        adj[two] = new LinkedList();
      }
      adj[one].add(edges[i][1]);
      adj[two].add(edges[i][0]);
    }


    Queue queue = new LinkedList();
    int[] sds = new int[n];

    queue.add(s);
    sds[s-1] = 0;

    boolean[] vertices = new boolean[n+1];
    int [] result = new int[n];
    Arrays.fill(result, -1);
    vertices[s] = true;

    while(!queue.isEmpty()) {
      Integer pointer = (Integer) queue.poll();
      if(adj[pointer]!=null){
      ListIterator listIterator = adj[pointer].listIterator();
      while (listIterator.hasNext()) {
        Integer ad = (Integer) listIterator.next();
        if (vertices[ad] != true) {
          sds[ad - 1] = sds[pointer - 1] + 6;
          result[ad - 1] = sds[pointer - 1] + 6;
          vertices[ad] = true;
          queue.add(ad);
        }
      }
    }
    }


    int [] result1 = new int[n-1];
    for(int i = 0, count = 0; i< result.length ; i++){
      if(i!=s-1){
        result1[count++] = result[i];
      }
    }
    return result1;


  }








  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {

    int q = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int qItr = 0; qItr < q; qItr++) {
      String[] nm = scanner.nextLine().split(" ");

      int n = Integer.parseInt(nm[0]);

      int m = Integer.parseInt(nm[1]);

      int[][] edges = new int[m][2];

      for (int i = 0; i < m; i++) {
        String[] edgesRowItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int j = 0; j < 2; j++) {
          int edgesItem = Integer.parseInt(edgesRowItems[j]);
          edges[i][j] = edgesItem;
        }
      }

      int s = scanner.nextInt();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
      int[] result =
          bfs(n, m, edges, s);

      for (int i = 0; i < result.length; i++) {
        System.out.print(String.valueOf(result[i]));

        if (i != result.length - 1) {
          System.out.print(" ");
        }
      }

      System.out.println();
    }



    scanner.close();
  }
}
