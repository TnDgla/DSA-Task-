package Array_Problems;

public class Rotate_Array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        Rotate(nums,k);
        for(int num:nums){
            System.out.println(num);
        }
    }
    public static void Rotate(int[] nums,int k){
        int n=nums.length;
        if(n==0){
            return;
        }
        k=k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
    public static void reverse(int[] nums,int i,int j){
        while(i<=j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    
}
