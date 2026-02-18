package src.MediumLevelArrayQuestions;
import java.util.*;
public class Majority_Element {
    public static void main(String[] args) {
        int[] arr={1,1,2,1,3,5,1};
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        int majority=n/2;
        boolean x=false;
        int el=0;
        for(int a:arr)
        {
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            if(e.getValue()>=majority)
            {
                x=true;
                el=e.getKey();
            }

        }
        if(x)
        {
            System.out.println(el);
        }
        else {
            System.out.println("-1");
        }
    }
}
