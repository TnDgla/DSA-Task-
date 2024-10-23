class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int i=0;
        int j=nums.length;
        reverse(nums,i,j-k-1);
        reverse(nums,j-k,j-1);
        reverse(nums,i,j-1);
        
    }
    public static void reverse(int[] arr,int p,int q){
        while(p<q){
            swap(arr,p,q);
            p++;
            q--;
        }
    }
    public static void swap(int[] arr,int p,int q){
        int temp=arr[p];
        arr[p]=arr[q];
        arr[q]=temp;
    }
}
