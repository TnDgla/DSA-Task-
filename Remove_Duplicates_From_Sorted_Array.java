package Array_Problems;

public class Remove_Duplicates_From_Sorted_Array {
    public static void main(String[] args) {
        int[] nums={1,1,2};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1 && nums[i]==nums[i+1]){
                continue;
            }
            else{
                nums[count++]=nums[i];
            }
        }
        return count;
    }
}
