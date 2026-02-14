package Array;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr={1,2,0,4,3,0,5,0};
        int idx=0;
        for(int i=0;i<arr.length;i++)
        {
                if(arr[i]>0)
                {
                    arr[idx++]=arr[i];
                }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                arr[idx++]=0;
            }
        }
        for(int a:arr)
        {
            System.out.print(a);
        }
    }
    
}
