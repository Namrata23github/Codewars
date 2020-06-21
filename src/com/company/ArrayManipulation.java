package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class ArrayManipulation {

  public static long arrayManipulation(int n, int m,  int[][] queries) {
    int[] result = new int[n + 1];

    int sizeOfQueries = m;


    for(int i= 0; i<m; i++){

      int a = queries[i][0];
      int b = queries[i][1];
      int k = queries[i][2];

      System.out.println(a + " " +b + " "+ k);
      result[a] = result[a]+k;
      if(b+1<=n+1){
        result[b+1] = result[b+1] - k;
      }
    }
    int size =result.length;
    int largest = result[1];
    for(int i = 1;i< n;i++){
      result[i+1] = result[i+1] +result[i];
      if(largest<result[i+1]){
        largest = result[i];
      }

    }


    return largest;
  }
}
