package src.Array;
import java.util.*;
public class Leaders_in_array {
    public static void main(String[] args) {
        int arr[]={16,17,4,3,5,2};
        List<Integer> leader=new ArrayList<>();
        int maxFromRight=arr[arr.length-1];
        leader.add(maxFromRight);
        int idx=0;
        for(int i=arr.length-2;i>=0;i--)
        {
          if(arr[i]>=maxFromRight)
          {
              maxFromRight=arr[i];
              leader.add(maxFromRight);
          }
        }
        Collections.reverse(leader);
        System.out.print(leader);
    }
}
