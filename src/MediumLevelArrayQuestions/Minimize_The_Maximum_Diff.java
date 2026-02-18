package src.MediumLevelArrayQuestions;

public class Minimize_The_Maximum_Diff {
    public static void main(String[] args) {
        int k=3;
        int[] arr={3,9,12,16,20};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=k)
            {
                arr[i]=arr[i]+k;
            }
            else if(arr[i]>k)
            {
                arr[i]=arr[i]-k;
            }
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]> max)
            {
                max=arr[i];
            }
            else if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        int val=max-min;
        System.out.println(val);
    }
}
