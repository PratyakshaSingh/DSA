package Array;

public class Rotate {
    public static void rotate(int[] arr,int d)
    {
        int n=arr.length;
        d=d%n;
        swap(arr,0,d-1);
        swap(arr,d,n-1);
        swap(arr,0,n-1);

    }
    public static void swap(int[] arr,int start,int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int d=2;
        rotate(arr,d);
        for(int a:arr)
        {
            System.out.print(a);
        }
    }
}
