package com.company.Others;


import java.io.*;
import java.util.*;

public class RoadsandLibraries {
  static int total = 0 ;
  static boolean visited[];
  static boolean  flag;

  // Complete the roadsAndLibraries function below.
  static long roadsAndLibraries(int n, int c_lib, int c_road, int[][] cities, int m) {
    total = 0 ;

    visited = new boolean[n];

    if(c_road > c_lib){
      return n*c_lib;
    }

    else {



      for(int i= 1; i< n; i++){
        flag = false;
        if(!visited[i]){
          dfs(cities, i, c_road, c_lib);
        }
      }

      for(int j = 0 ; j< n; j++){
        if(visited[j] == false)
        {
          total = total + c_lib;
        }
      }
      return total;
    }
  }


  static void dfs (int[][] city, int i, int c_road, int c_lib){
    for(int j=0; j< city.length;j++){

      if(city[i][j]==1 && visited[j]==false){
        if(flag == false){
          total = total + c_lib;
          flag = true;
        }
        visited[i] = true;
        visited[j]= true;
        flag = true;
        total = total + c_road;
        dfs(city, j, c_road,c_lib);
      }
    }
  }


  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {

    int q = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int qItr = 0; qItr < q; qItr++) {
      String[] nmC_libC_road = scanner.nextLine().split(" ");

      int n = Integer.parseInt(nmC_libC_road[0]);

      int m = Integer.parseInt(nmC_libC_road[1]);

      int c_lib = Integer.parseInt(nmC_libC_road[2]);

      int c_road = Integer.parseInt(nmC_libC_road[3]);

      int[][] cities = new int[n][n];

      for (int i = 0; i < m; i++) {
        String[] citiesRowItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int a1 = Integer.parseInt(citiesRowItems[0]);
        int a2 = Integer.parseInt(citiesRowItems[1]);
        cities[a1-1][a2-1] = 1;
        cities[a2-1][a1-1] = 1;


      }

//      for (int i = 0; i< n; i++){
//        for (int j = 0; j< n; j++){
//          System.out.print(" "+cities[i][j]+ " ");
//        }
//        System.out.print("\n");
//      }

      long result = roadsAndLibraries(n, c_lib, c_road, cities, m);
      System.out.println(result);

    }


    scanner.close();
  }
}
