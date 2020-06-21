//https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

package com.company.Others;

public class CountingValleys {

  static public int countingValleys(int n, String s) {

    int level = 0;
    int valleys = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'U') {
        level++;
      } else if (s.charAt(i) == 'D') {
        if (level == 0) {
          valleys++;
        }
        level--;
      }
    }
    return valleys;
  }
}
