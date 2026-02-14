package Array;

public class AddingOne {
    public static void main(String[] args) {
        int[] arr={9,9,9};
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            sb.append(arr[i]);
        }
        System.out.println(sb);
       String result=sb.toString();
       int fina=Integer.parseInt(result)+1;
       System.out.print(fina);
    }
}
