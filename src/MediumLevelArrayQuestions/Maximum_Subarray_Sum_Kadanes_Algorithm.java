package src.MediumLevelArrayQuestions;

public class Maximum_Subarray_Sum_Kadanes_Algorithm {
    public static void main(String[] args) {
        int[] arr={-1};
        int maxSum=arr[0];
        int current=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            current=Math.max(arr[i],current+arr[i]);
            maxSum=Math.max(maxSum,current);
        }
        System.out.println(maxSum);
    }
}
