package week1;
import java.util.Scanner;

public class sortParity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sortParity ob=new sortParity();
        System.out.println(ob.sortArrayByParity(arr));
    }
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int i=0,j=n-1;
        while(i<j){
            while(i<j && nums[i]%2==0)i++;
            while(i<j && nums[j]%2!=0)j--;
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        return nums;
    }
}
