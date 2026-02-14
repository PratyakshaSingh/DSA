package Array;

public class Reverse {
    public static void main(String[] args) {
        int[] arr={1,4,3,2,6,5};
        int j=arr.length-1;
        int i=0;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int a:arr)
        {
            System.out.print(a);
        }
    }
    
}
