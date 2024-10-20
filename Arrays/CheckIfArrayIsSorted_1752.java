package Arrays;

public class CheckIfArrayIsSorted_1752 {

    public static boolean check(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }
        }
        return (count > 1) ? false : true;
    }

    public static void main(String[] args) {
        int[] a = { 3, 4, 5, 1, 2 };
        boolean result = check(a);
        System.out.println(result);
    }

}