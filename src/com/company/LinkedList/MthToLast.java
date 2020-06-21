package com.company.LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MthToLast {




   static class  Node {
      int data;
      Node next;

      Node (int d){
        data = d;
        next = null;
      }
    }

    public static void main(String[] args) throws IOException {
      /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

      BufferedReader scanner =
          new BufferedReader(new InputStreamReader(System.in));

      int m = Integer.parseInt(scanner.readLine());
      scanner.readLine();
      String[] in = scanner.readLine().split(" ");
      int[] arr = new int[in.length];
      Node head;

      if(m>in.length){
        System.out.println("NIL");
      }
      else {
        Node node1 = new Node(Integer.parseInt(in[0]));
        head = node1;
        Node pointer = node1;
        Node p = null;

        if (m == 1) {
          p = pointer;
        }

        for (int i = 1; i < in.length; i++) {
          int item = Integer.parseInt(in[i]);
          arr[i] = item;
          Node node = new Node(Integer.parseInt(in[i]));
          pointer.next = node;
          pointer = pointer.next;

          if (i >= m - 1) {

            if (p == null) {
              p = head;
            } else {
              p = p.next;
            }
          }
        }

        System.out.println(p.data);


      }
    }

  }

