package com.company.String;

public class gcdOfStrings {

    public static String gcdOfString(String str1, String str2) {

      int l = str2.length();

      boolean canBeDivided = false;

      if(str1.split(str2).length == 0){
        canBeDivided = true;
        if(str1.length() == str2.length()){
          return str2;
        }
      }

      //checkIfThereIsARepeatedString

      String s21 = str2;
      String s22 ;
      String substring = s21;
      while (s21.length()>0){
         substring = s21;
         int l1 = s21.length()/2 -1;
         if(l1>0) {
           s21 = s21.substring(0, (s21.length() / 2 - 1));
           s22 = s21.substring(s21.length() / 2, s21.length() - 1);
           if (s21.indexOf(0) == s22.indexOf(0)) {
             continue;
           } else {
             return substring;
           }
         }

      }



      String pattern = "";

      return "";
    }

  public static void main(String[] args) {
    System.out.println(gcdOfString("ABABAB","EQEQ" ));

  }

}


