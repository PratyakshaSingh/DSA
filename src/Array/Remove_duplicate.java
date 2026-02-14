package src.Array;
import java.net.StandardSocketOptions;
import java.util.*;
public class Remove_duplicate {
    public static void main(String[] args) {
        int[] arr={2,2,2,2};
        Set<Integer> set=new HashSet<>();
        for(int a:arr)
        {
            set.add(a);
        }
        System.out.println(set);
    }
}
