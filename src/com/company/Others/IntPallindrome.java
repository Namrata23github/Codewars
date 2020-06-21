package com.company.Others;

import java.math.BigDecimal;
import java.math.BigInteger;

public class IntPallindrome {


    public static boolean isPalindrome(int x) {

      int reverse = 0;
      int c = x;
      do {
        reverse = reverse*10 + (c%10);
        c = c/10;

      }while (c!=0);

      BigInteger b1 = new BigInteger("3876620623801494171");
      BigInteger b2 = new BigInteger("6529364523802684779");

      System.out.println(String.valueOf(b1.add(b2)));




      if(x==reverse){
        return true;
      }
      return false;

    }

  public static void main(String[] args) {
    System.out.println(isPalindrome(121));
  }

}
