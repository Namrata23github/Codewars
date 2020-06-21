package com.company.DynamicProgramming;


import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/climbing-stairs/
public class ClimbingStairs {

  public static int climbStairs(int stairsRemaining) {

    Map<Integer,Integer> m = new HashMap();
    return  climbIt (stairsRemaining,m );

  }

  public static int climbIt(int stairsRemaining, Map<Integer,Integer> m ){

    if(stairsRemaining<=0){
      return 0;
    }

    if(stairsRemaining==0){
      return 1;
    }

    if(m.containsKey(stairsRemaining)){
      return m.get(stairsRemaining);
    }

    m.put( stairsRemaining, climbIt(stairsRemaining -1, m) + climbIt(stairsRemaining -2,m));

    return m.get(stairsRemaining);

  }


  public static void main(String[] args) {
    System.out.println(climbStairs(2));
  }

}
