package com.company.fundamentals;

import static java.lang.Math.abs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
  public static int minimumIncompatibility(int[] nums, int k) {


    //sort the array
    Arrays.sort(nums);


    int size = nums.length;
    int[][] td = new int[size/2+1][2];
    ArrayList<Integer> arrayList = new ArrayList();
    int diff = 0;
    //run the  loop of array
    for(int i = 0; i<size;i++) {


      // first check there is any element in the second array if yes then check  while it is equal to i and add that element to 2d array
      if(!arrayList.isEmpty()){
        int j = 0;
        while (j<arrayList.size() && arrayList.get(j)== nums[i]  ){
          j++;
        }
        if(j<arrayList.size()){
          diff = diff + (abs(arrayList.get(j) - nums[i]));
          arrayList.remove(j);
        }
      }
      // else if i is not equal to i+1 I will add it to 2d and increement the array by  1
      int l = i+1;
      while (l<size && nums[i]==nums[l]  ){
        l++;
        arrayList.add(nums[l]);
      }

      if(l<size){
        diff = diff + (abs(nums[i]-nums[l]));
        i=l;
      }else {

        while (!arrayList.isEmpty()){
          int j=0;
          int m =0;
          while ( j<arrayList.size() && arrayList.get(j)== arrayList.get(m) ){
            m++;
          }
          if(m<j){
            diff = diff + (abs(arrayList.get(j) - arrayList.get(m)));
            arrayList.remove(j);
            arrayList.remove(m);
          }else{
            break;
          }

        }
      }

      //if i is equal to i+1
      //while i+n is equal to i add that element to array and increement the array

      //else add value to the 2d array and increement the array
    }
    return diff;
}

public static void main(String ar[]){
    int [] a = new int[]{1,2,1,4};
  minimumIncompatibility(a, 2);
}

}
