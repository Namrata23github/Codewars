package com.company.Others;


import com.company.stream.Trader;
import com.company.stream.Transaction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Rank_up {

  //https://www.codewars.com/kata/tortoise-racing
  public static int[] race(int v1, int v2, int g) {
    if(v1>v2)
      return null;
    else{
      Double relative_speed_inseconds = (v2 - v1)/3600.0;
      Double time = g / relative_speed_inseconds;
      int t = time.intValue();
      int sec = t % 60;
      t =t/60;
      int min = t % 60;
      int hour = t / 60;
      int a[] = {hour,min, sec};
      return a;
    }

  }

  //https://www.codewars.com/kata/valid-braces/train/java
  public static boolean isValid(String braces) {
    char[] chars = braces.toCharArray();
    ArrayList<Character> closing = new ArrayList<>();
    closing.add(')');
    closing.add('}');
    closing.add(']');
    ArrayList<Character> opening = new ArrayList<>();
    opening.add('(');
    opening.add('{');
    opening.add('[');
    Stack stack = new Stack();
    for (char a : chars) {
      if (opening.contains(a)) {
        stack.push(a);
      } else {
        if (stack.size() == 0) {
          return false;
        }
        if (opening.indexOf(stack.pop()) != closing.indexOf(a)) {
          return false;
        }
      }
    }
    return stack.size() == 0;
  }

  public static int[] rotLeft(int[] a, int d) {
    if (d > a.length) {
      d = d % a.length;
    }
    int[] b = new int[a.length];
    int j = 0;
    for (int i = d; j < a.length; i++) {
      b[j] = a[i];
      j++;
      if (i == a.length - 1) {
        i = -1;
      }
    }
    return b;

  }

  public static boolean lambdaFuction(String a, Predicate<String> p) {
    return p.test(a);
  }

  public static void bifunc() {
    Map<String, Integer> salaries = new HashMap<>();
    salaries.put("John", 40000);
    salaries.put("Freddy", 30000);
    salaries.put("Samuel", 50000);

    salaries.replaceAll((n, n1) -> n.equals("Freddy") ? n1 : n1 + 90);

  }

  public static Double supplierFuction(Supplier<Integer> p) {
    return Math.pow(p.get(), 4);
  }

  public static void StreamTest() {

    Trader raoul = new Trader("Raoul", "Cambridge");
    Trader mario = new Trader("Mario", "Milan");
    Trader alan = new Trader("Alan", "Cambridge");
    Trader brian = new Trader("Brian", "Cambridge");

    List<Transaction> transactions = Arrays.asList(
        new Transaction(brian, 2011, 300),
        new Transaction(raoul, 2012, 1000),
        new Transaction(raoul, 2011, 400),
        new Transaction(mario, 2012, 710),
        new Transaction(mario, 2012, 700),
        new Transaction(alan, 2012, 950)
    );

//Find all transactions in the year 2011 and sort them by value (small to high).
//    List<Transaction> a = transactions.stream().filter(a1 -> a1.getYear() == 2011)
//        .sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
//    a.forEach(System.out::println);

    //What are all the unique cities where the traders work?
//    List<String> cities = transactions.stream().map(a -> a.getTrader().getCity()).distinct()
//        .collect(
//            Collectors.toList());
//    cities.forEach(System.out::println);

//    Find all traders from Cambridge and sort them by name.
//    List<Trader> traders = transactions.stream().map(b -> b.getTrader())
//        .filter(a -> a.getCity().equalsIgnoreCase("Cambridge"))
//        .sorted(Comparator.comparing(a -> a.getName()))
//        .collect(Collectors.toList());
//    traders.forEach(System.out::println);

    //Return a string of all traders’ names sorted alphabetically
//    List<String> traderName = transactions.stream().map(a -> a.getTrader().getName()).sorted()
//        .distinct()
//        .collect(
//            Collectors.toList());
//
//    traderName.forEach(System.out::println);

    //. Are any traders based in Milan?
//    System.out.println(
//        transactions.stream().map(a -> a.getTrader().getCity())
//            .filter(a -> a.equalsIgnoreCase("Milan")).
//            findAny().isPresent());

    List<Integer> values = transactions.stream()
        .filter(a -> a.getTrader().getCity().equalsIgnoreCase("Cambridge")).map(a -> a.getValue())
        .collect(
            Collectors.toList());
    values.forEach(System.out::println);
  }
}
