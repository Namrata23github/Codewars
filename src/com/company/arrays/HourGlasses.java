package com.company.arrays;

import java.util.ArrayList;
import java.util.List;

public class HourGlasses {

  static public int hourglassSum(int[][] a) {

    List<Integer> aa = new ArrayList();

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        int value= a[i][j] + a[i ][j+1] + a[i][j+2] + a[i + 1][j + 1] + a[i+2][j]+ a[i + 2][j + 1] + a[i + 2][j
            + 2];
        System.out.println(value);
   aa.add(value);
      }
    }
    return aa.stream().reduce((a1,a2)-> a1>a2?  a1:a2).get();
  }
}
