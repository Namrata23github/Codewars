//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//
//
//class Result {
//
//  /*
//   * Complete the 'sortedSum' function below.
//   *
//   * The function is expected to return an INTEGER.
//   * The function accepts INTEGER_ARRAY a as parameter.
//   */
//
//  public static int sortedSum(List<Integer> a) {
//
//    a.toArray();
//    // Write your code here
//    Long l = 0L;
//    for( int i = 0; i< a.size() ; i++)
//    {
//      List<Integer> b = a.subList(0,i+1).stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
//      Long l1 = 0L;
//      Long count = 1L;
//      for(int j =i; j >=0 ; j--){
//        l1 = l1 + b.get(j)*count;
//        count++;
//      }
//
//      l = l +l1;
//    }
//
//    Double result = (l % (Math.pow(10,9) + 7));
//    return result.intValue();
//
//  }
//
//}
//
//public class Solution {
//  public static void main(String[] args) throws IOException {
//    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//    int aCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//    List<Integer> a = IntStream.range(0, aCount).mapToObj(i -> {
//      try {
//        return bufferedReader.readLine().replaceAll("\\s+$", "");
//      } catch (IOException ex) {
//        throw new RuntimeException(ex);
//      }
//    })
//        .map(String::trim)
//        .map(Integer::parseInt)
//        .collect(toList());
//
//    int result = Result.sortedSum(a);
//
//    bufferedWriter.write(String.valueOf(result));
//    bufferedWriter.newLine();
//
//    bufferedReader.close();
//    bufferedWriter.close();
//  }
//}
