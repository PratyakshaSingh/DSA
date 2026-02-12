package Array;

public class Second_Largest_Element {
    public static int find(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        int sec_max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
            sec_max=max;
            max=arr[i];
            }
            else if(arr[i] != max && arr[i]>sec_max)
            {
                sec_max=arr[i];
            }
        }
        return sec_max;
    }
    public static void main(String[] args) {
        int[] arr={12,35,1,10,34,1};
        int sec_max=find(arr);
        System.out.println(sec_max);
    }
}
