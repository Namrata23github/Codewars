package com.company.String;
//https://leetcode.com/problems/longest-substring-without-repeating-characters/

import java.util.HashMap;

public class lengthOfLongestSubstring {

  public static int lengthOfLongestSubstring(String s) {

    char[] sc = s.toCharArray();
    int maxLength = 0;
    int currentLength = 0;
    int startWindow = 0;

    int length = sc.length;
    HashMap<Character, Integer> hash = new HashMap<>();


    for(int windowEnd =0; windowEnd<length;windowEnd++ ){

      char c = sc[windowEnd];
      int v = hash.getOrDefault(c,0) + 1;
      hash.put(sc[windowEnd],v);
      if(v>1){
        for(int i = startWindow; i< s.indexOf(c,startWindow) + 1 ; i++){
          if(hash.get(sc[i]) > 0){
            hash.put(sc[i],hash.get(sc[i])-1);
          }
        }
        startWindow = s.indexOf(c,startWindow) + 1;
        currentLength = windowEnd - startWindow + 1;

      }else {
        hash.put(c, 1);
        currentLength++;
        if(currentLength>maxLength){
          maxLength = currentLength;
        }

      }
  }
    return maxLength;
}
  public static void main(String[] args) {

    System.out.println(lengthOfLongestSubstring("eeydgwdykpv"));
  }
}
