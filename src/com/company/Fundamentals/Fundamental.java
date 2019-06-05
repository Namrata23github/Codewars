package com.company.Fundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Fundamental {

  public static int countVowel(String str) {
    Long vowelsCount=  str.chars().filter(c -> (c =='a'||c=='e'||c=='i'||c=='o'||c=='u')).count();
    return vowelsCount.intValue();
  }

  public static int findSmallestInt(int[] args) {
    List<Integer> a = Arrays.stream(args).boxed().collect(Collectors.toList());
    Integer v = a.stream().min(Integer::compare).get();
    return v;
  }

}
