package com.company.Rank_Up;

//https://www.codewars.com/kata/tortoise-racing
public class Tortoise_racing {

  public static int[] race(int v1, int v2, int g) {
    if(v1>v2)
      return null;
    else{
      Double relative_speed_inseconds = (v2 - v1)/3600.0;
      Double time = g / relative_speed_inseconds;
      int t = time.intValue();
      int sec = t % 60;
      t =t/60;
      int min = t % 60;
      int hour = t / 60;
      int a[] = {hour,min, sec};
      return a;

    }
  }
}
