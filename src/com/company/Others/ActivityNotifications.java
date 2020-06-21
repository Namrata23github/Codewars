package com.company.Others;

import java.io.*;
import java.util.*;


public class ActivityNotifications {

  // Complete the activityNotifications function below.
  static int activityNotifications(int[] expenditure, int d) {

    float median = 0;
    int noti = 0;
    boolean isOdd = false;

    int index1 = 0;
    if((d + 1 )%2 == 0){
      isOdd = true;
    }

    index1 =  d/ 2 +1;
    for(int i = d-1,  j =0 ;i< expenditure.length; i++){
      Arrays.sort(expenditure, 0, i);

      if(!isOdd){
        median =(expenditure[index1 -1 + j] + expenditure[index1 + j])/2;
      }else {
        median = expenditure[index1 + j];
      }

      if(expenditure[i] >= median *2 ){
        ++noti;
      }
    }
    return noti;
  }


  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {

    String[] nd = scanner.nextLine().split(" ");

    int n = Integer.parseInt(nd[0]);

    int d = Integer.parseInt(nd[1]);

    int[] expenditure = new int[n];

    String[] expenditureItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < n; i++) {
      int expenditureItem = Integer.parseInt(expenditureItems[i]);
      expenditure[i] = expenditureItem;
    }

    int result = activityNotifications(expenditure, d);

  System.out.println(String.valueOf(result));

    scanner.close();
  }
}
