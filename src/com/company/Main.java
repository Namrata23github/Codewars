package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {



    static  boolean  permutation(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] letters = new int[128];
        char[] s_array = s.toCharArray();
        for (char c : s_array)
        {   letters[c]++;
        }
        for (int i= 0; i < t.length(); i++) {
            int c= (int) t.charAt(i);
            letters[c]--;
            if (letters[c] < 0) {
                return false;

            }
        }

        return true;
         }

         class Node {
            String id;
             String parentid;
             String name;
             List<Node> child = new ArrayList<>();
             int level = 0;
         }

    public void main(String[] args) {


        final Node n = new Node();
        n.level = 2;

        List<Node> m = new ArrayList<>();

        m.forEach( d -> {

            m.forEach( e -> {
                if(d.id == e.parentid){
                    d.child.add(e);
                    addLevel(e);
                }
            });
        });

    }

    public static  void addLevel (Node n){
        n.level ++;
        if(n.child.isEmpty())
            return;

        n.child.forEach(c -> {
            addLevel(c);
        });
    }

}
