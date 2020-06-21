/*John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
For example, there are  socks with colors . There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .
Function Description
Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching pairs of socks that are available.
sockMerchant has the following parameter(s):
n: the number of socks in the pile
ar: the colors of each sock
Input Format
The first line contains an integer , the number of socks represented in .
The second line contains  space-separated integers describing the colors  of the socks in the pile.
Constraints

 where
Output Format
Return the total number of matching pairs of socks that John can sell.
Sample Input
9
10 20 20 10 10 30 50 10 20
Sample Output
3*/
package com.company.Others;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SockMerchant {
  static public int sockMerchant(int n, int[] ar) {
    List<Integer> a= Arrays.stream(ar).boxed().sorted().map(v -> v==0?1:v).collect(Collectors.toList());
    int c = a.get(0);
    a.remove(0);
    int index=0;
    int add=c;
    int count = 0;
    while(index < a.size() ) {
      while( index < a.size() && c==a.get(index) ) {
        add = add+c;
        ++index;
      }
      count = count + add/(c*2);
      if(index < a.size() ) {
        c = a.get(index++);
      }
      add=c;
    }
    return count;
  }
}
