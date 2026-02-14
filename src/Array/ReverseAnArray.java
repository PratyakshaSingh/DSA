package Array;

public class ReverseAnArray {
    public static void rotate(int[] arr,int k)
    {
       int n=arr.length;
        for(int i=0;i<n;i+=k)
        {
            int start=i;
            int end=Math.min(i+k-1,n-1);
            swap(arr,start,end);
        }

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
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8};
        int key=3;
        rotate(arr,key);
        for(int a:arr)
        {
            System.out.println(a);
        }
    }
    
}
