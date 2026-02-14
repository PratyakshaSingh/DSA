package src.Array;
import java.util.*;
public class Missing_and_Repeating {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3};

        int n = arr.length;

        long sumN = (long) n * (n + 1) / 2;
        long sumSquareN = (long) n * (n + 1) * (2 * n + 1) / 6;

        long actualSum = 0;
        long actualSquareSum = 0;

        for (int num : arr) {
            actualSum += num;
            actualSquareSum += (long) num * num;
        }

        long diff = actualSum - sumN; // repeating - missing
        long squareDiff = actualSquareSum - sumSquareN;

        long sum = squareDiff / diff; // repeating + missing

        long repeating = (diff + sum) / 2;
        long missing = repeating - diff;

        System.out.println("Repeating: " + repeating);
        System.out.println("Missing: " + missing);

    }
}
