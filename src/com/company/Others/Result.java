package com.company.Others;

public class Result {
  public static void decryptPassword(String s) {
    // Write your code here

    char[] decryptString = new char[s.length()] ;
    int indexOfD = -1;

    char[] ch = s.toCharArray();
    int numPos = -1;
    boolean flagg = true;

    for (int i = 0; i< s.length();i++) {
      char c = ch[i];

      if (flagg = true){
        Boolean flag = Character.isDigit(c);

      if (flag == true && Character.getNumericValue(c) != 0) {
        numPos++;
        continue;
      }
      else {
        flagg = false;
      }
    }


        if(c == '*'){
          char second = decryptString[indexOfD];
          char first = decryptString[indexOfD -1 ];
          decryptString[indexOfD] = first;
          decryptString[indexOfD -1] = second;
          continue;

        }

        if(c=='0'){
         decryptString[++indexOfD] = ch[numPos] ;
         --numPos;
         continue;
        }

        else {
          decryptString[++indexOfD]= c ;
        }

    }

    decryptString[++indexOfD] = '\0';

    StringBuilder sb = new StringBuilder();

    //Using append() method to create a string
    for (int i = 0; i <indexOfD; i++) {
      sb.append(decryptString[i]);
    }

    System.out.println(sb.toString());
  }
}
