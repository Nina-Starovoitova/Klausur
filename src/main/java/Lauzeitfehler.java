import patterns.sigleton.StaticBlockSingleton;

import java.util.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Lauzeitfehler {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {

        List<Integer> sortedList = arr.stream().sorted().collect(toList());
        long sum = arr.stream().mapToLong(Integer::longValue).sum();
        long minSum = sum - sortedList.get(sortedList.size() - 1);
        long maxSum = sum - sortedList.get(0);
        System.out.println(minSum + " " + maxSum);

    }
    private void sedPo(){
        String ggf="dasda";
    }
    private void sedFo(){
        String ggf="dasda";
    }
    private void sedLo(){
        String ggf="dasda";
    }

    public static void main(String[] args) {
        System.out.println( StaticBlockSingleton.getInstance().Star() + StaticBlockSingleton.getInstance().NinaStar());

    }

}

