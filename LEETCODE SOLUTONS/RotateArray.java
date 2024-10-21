class Solution {
    public static void reverse(int arr[],int i,int j){
        while(i<j){
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          i++;
          j--;
        }
    }
      public void rotate(int[] nums, int k) {
    k=k%nums.length;
    reverse(nums,0,nums.length-1);
    reverse(nums,0,k-1);
    reverse(nums,k,nums.length-1);
  }
  }
  