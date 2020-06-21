package com.company.Greedy;
//https://leetcode.com/problems/couples-holding-hands/

import java.util.HashMap;
import java.util.Map;

public class CouplesHoldingHands {

  public static  int minSwapsCouples(int[] row) {

    int l = row.length;
    int[] r = new int[l];
    for (int i = 0; i<l;i++){
      r[row[i]] = i;
   }

    int swap = 0;
    for (int i = 0; i<l-1;i =i+2){
      int a =row[i];
      int b =row[i+1];

      if(Math.abs(a-b)!=1 ||((a>b)&& (a%2==0) ) || (a<b) && (a%2!=0)){
        if(b%2==0){

          // couple of b

          int t = r[b+1];
         int temp = row[r[b+1]];

         //swapping a to b's couple position
          row[r[b+1]] = a;

          r[b+1] = i;
          r[a] = t;
          row[i] = temp;

         ++swap;
        }else{
          int temp = row[r[b-1]];
          int t = r[b-1];

          row[r[b-1]] = a;

          r[b-1] = i;
          r[a] = t;
          row[i] = temp;
          ++swap;
        }
      }
    }
    return swap;
  }

  public static void main(String[] args) {

  int[] row = new int[]{0,2,4,6,7,1,3,5};
    System.out.println(minSwapsCouples( row));
  }

}
