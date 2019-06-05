package com.company.Rank_Up;


import java.util.ArrayList;
import java.util.Stack;

public class Rank_up {

  //https://www.codewars.com/kata/tortoise-racing
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

  //https://www.codewars.com/kata/valid-braces/train/java
  public static boolean isValid(String braces) {
    char[] chars = braces.toCharArray();
    ArrayList<Character> closing = new ArrayList<>();
    closing.add(')');
    closing.add('}');
    closing.add(']');
    ArrayList<Character> opening = new ArrayList<>();
    opening.add('(');
    opening.add('{');
    opening.add('[');
    Stack stack = new Stack();
    for (char a : chars) {
      if (opening.contains(a)) {
        stack.push(a);
      } else {
        if (stack.size() == 0) {
          return false;
        }
        if (opening.indexOf(stack.pop()) != closing.indexOf(a)) {
          return false;
        }
      }
    }

    return stack.size() == 0;
  }

}
