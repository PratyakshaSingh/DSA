package Array;

public class MaxConsecutive {
    public static void main(String[] args) {
        int[] arr={0,1,0,1,1,1,1};
        int count=1;
        int max_count=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==arr[i-1])
            {
                count++;
            }
            else
            {
                max_count=Math.max(count,max_count);
                count=1;
            }
        }
        System.out.println(count);
    }
    
}
