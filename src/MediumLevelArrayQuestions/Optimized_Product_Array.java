package src.MediumLevelArrayQuestions;

public class Optimized_Product_Array {
    public static void main(String[] args) {
        int[] arr={10,3,5,6,2};
        int n=arr.length;
        int[] product=new int[arr.length];
        product[0]=1;
        for(int i=1;i<n;i++)
        {
            product[i]=product[i-1]*arr[i-1];
        }
        int suffix=1;
        for(int i=n-1;i>=0;i--)
        {
            product[i]=product[i]*suffix;
            suffix*=arr[i];
        }
        for(int value:product)
        {
            System.out.println(value);
        }
    }
}
