import java.util.*;
class Buy_Two_Chocolates {
    public int buyChoco(int[] arr, int money) {
        Arrays.sort(arr);
        int sum=0;
        sum=money-arr[0]-arr[1];
        if(sum>=0){
            return sum;
        }
        else{
            return money;
        }
        

    }
}