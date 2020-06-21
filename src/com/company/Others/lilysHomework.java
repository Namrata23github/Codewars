package com.company.Others;

import java.io.*;
import java.util.*;

public class lilysHomework {

  // Complete the lilysHomework function below.
  static int lilysHomework(int[] arr) {
    int length = arr.length;

    int[] arr1 = Arrays.copyOf(arr, length);
    Arrays.sort(arr1);
    int[] arr2 = Arrays.copyOf(arr, length);
    Collections.reverse(Arrays.asList(arr2));

    List arr3 = Arrays.asList(arr);
    int count = 0;
    int count2  = 0;

    for (int i = 0; i< length -1; i++ ){
      if(arr[i]!=arr1[i]){
        int temp =arr[arr3.indexOf(arr1[i])];
      }
    }

    return count > count2 ? count2: count;

  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {

    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    int[] arr = new int[n];

    String[] arrItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < n; i++) {
      int arrItem = Integer.parseInt(arrItems[i]);
      arr[i] = arrItem;
    }

    int result = lilysHomework(arr);

    scanner.close();
  }
}
