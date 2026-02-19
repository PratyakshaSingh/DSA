package src.MediumLevelArrayQuestions;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] arr={-2,6,-3,-10,0,2};
        int n=arr.length;
        int maxProd=arr[0];
        for(int i=0;i<n;i++)
        {
            int mul=1;
            for(int j=i;j<n;j++)
            {
                mul*=arr[j];
                maxProd=Math.max(maxProd,mul);
            }
        }
        System.out.println(maxProd);
    }
}
