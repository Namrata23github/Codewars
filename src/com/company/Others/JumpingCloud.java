package com.company.Others;

public class JumpingCloud {

  static int jumpingOnClouds(int[] c) {

    int i = 0;
    int  jump =0;
    int size = c.length;
    while ( i<size ){
      if( c[i+2]==0)
      {
        i = i+2;
      }
      else {
        i=i+1;

      }
      ++jump;
    }
    return jump;
  }
}
