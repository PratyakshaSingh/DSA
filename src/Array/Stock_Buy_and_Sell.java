package src.Array;

public class Stock_Buy_and_Sell {
    public static void main(String[] args) {
        int[] arr={7,10,1,3,6,9,2};
        int maxProfit =0;
        int min=Integer.MAX_VALUE;
       for(int price:arr)
       {
           if(price<min)
           {
               min=price;
           }
           else {
               int profit=price-min;
               maxProfit=Math.max(maxProfit,profit);
           }
       }
       System.out.println(maxProfit);
    }
}