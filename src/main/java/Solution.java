import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) {
        int ter = 12;
        System.out.println(args);
        TestNina juni = new TestNina(ter);
        String bufferedReader = "2 1 5 3 9";
        List<Integer> arr = Stream.of(bufferedReader.replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        Lauzeitfehler.miniMaxSum(arr);
        try {
            if (ter <= 19)
                throw new IOException   ("sdfnsk");
        } catch (Exception ex) {

        }


    }
}
