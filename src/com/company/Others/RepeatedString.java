//https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
package com.company.Others;

import java.util.stream.Stream;

public class RepeatedString {
  static public long repeatedString(String s, long n) {
    int length = s.length();
    String st = s;

    long mod = n%length;
    long numberofcompleteword = n/length;

    int countOfA=0;
    s= s.replaceAll("a","");
    countOfA = length - s.length() ;


    long c = countOfA*numberofcompleteword;
    st = st.substring(0,(int)mod);
    length = st.length();
    st= st.replaceAll("a","");
    c = c + (length - st.length() );
    return c;
  }

}
