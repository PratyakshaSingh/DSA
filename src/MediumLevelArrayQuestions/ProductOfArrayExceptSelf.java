package src.MediumLevelArrayQuestions;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr={10,3,5,6,2};
        int[] product=new int[arr.length];
        Arrays.fill(product,1);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i != j)
                {
                    product[j]*=arr[i];
                }
            }
        }
        for(int a:product)
        {
            System.out.println(a);
        }
    }
}
