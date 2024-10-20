public class Leet_2540 {
    public int getCommon(int[] nums1, int[] nums2) {
        int min=-1;

        int i=0;
        int j=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                min=nums1[i];
                break;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
        }

        return min;
    }
}
