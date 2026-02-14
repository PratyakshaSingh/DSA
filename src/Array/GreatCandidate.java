package Array;

 public class GreatCandidate {
    public static void main(String[] args) {
        int[] arr={10,3,5,6,20};
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
            else if(arr[i] != max && sec_max<arr[i])
                {
                    third_max=sec_max;
                    sec_max=arr[i];
                }
                else if(arr[i] != max && arr[i] != sec_max)
                {
                    third_max=arr[i];
                }
            
        }
        int result=max*sec_max*third_max;
        System.out.println(result);
    }

    
}
