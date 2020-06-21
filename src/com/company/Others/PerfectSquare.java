package com.company.Others;

public class PerfectSquare {

  static int squares(int a, int b) {

    int countOfSquares = 0;

    Double sqrt = Math.sqrt(a);

    if((sqrt - Math.floor(sqrt)) == 0){
      ++countOfSquares;
    }

   

    return  countOfSquares+((int) (Math.sqrt(b))) -sqrt.intValue() ;

  }
}
