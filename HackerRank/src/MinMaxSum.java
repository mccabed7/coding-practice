//Fully correct as at 30 August 2023

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        long sum = 0;
        long highest = Integer.MIN_VALUE;
        long lowest = Integer.MAX_VALUE;

        for(int i = 0; i < arr.size(); i++){
            sum += arr.get(i);
            if(arr.get(i) > highest) highest = arr.get(i);
            if(arr.get(i) < lowest) lowest = arr.get(i);
        }

        System.out.printf("%d %d", sum - highest, sum - lowest);



    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
