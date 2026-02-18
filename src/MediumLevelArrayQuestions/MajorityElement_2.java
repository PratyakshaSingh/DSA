package src.MediumLevelArrayQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement_2 {
    public static void main(String[] args) {
        int[] arr={2,2,3,1,3,2,1,1};
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        int majority=n/3;
        for(int a:arr)
        {
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            if(e.getValue() > majority)
            {
                list.add(e.getKey());
            }
        }
        System.out.println(list);
    }

}
