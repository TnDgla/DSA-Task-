class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int j=0;
        for(int i=0;i<m+n;i++){
            if(i<m){
                nums1[i]=nums1[i];
            }
            else{
                nums1[i]=nums2[j];
                j++;
            }
        }
        Arrays.sort(nums1);
       
    }
}