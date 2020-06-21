//https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
package com.company.arrays;

public class LeftRotation {

 public static int[] rotLeft(int[] a, int d) {
    int size = a.length;
    int[] b = new int[size];

    for(int i = 0; i<size;i++){
      if(i>=d)
      {
        b[i-d] = a[i];
      }
      else {
        b[size-(d-i)] = a[i];
      }

    }
    return b;
  }


}
