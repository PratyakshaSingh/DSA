package Array;

public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr={1, 14, 2, 16, 10, 20};
        int max=Integer.MIN_VALUE;
        int sec_max=Integer.MIN_VALUE;
        int third_max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                third_max=sec_max;
                sec_max=max;
                max=arr[i];
            }
            else if(arr[i] != max && arr[i]>sec_max)
            {
                third_max=sec_max;
                sec_max=arr[i];
            }
            else if(arr[i] != max && arr[i] != sec_max)
            {
                third_max=arr[i];
            }
        }
        System.out.println(third_max);
    }
}
