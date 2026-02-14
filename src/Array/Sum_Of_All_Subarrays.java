package src.Array;

public class Sum_Of_All_Subarrays {
    public static void main(String[] args) {
        int[] arr={1,4,5,3,2};
        int n = arr.length;

        long totalSum = 0;

        for (int i = 0; i < n; i++) {
            totalSum += (long) arr[i] * (i + 1) * (n - i);
        }

        System.out.println(totalSum);

    }
}
