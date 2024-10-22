public class LongestMountainArray {
    public static int longestMountain(int[] arr) {
        int n = arr.length;
        if (n < 3) return 0; 
        int longest = 0;

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                int left = i - 1;
                int right = i + 1;

                while (left > 0 && arr[left] > arr[left - 1]) {
                    left--;
                }

                while (right < n - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }

                int currentMountainLength = right - left + 1;
                longest = Math.max(longest, currentMountainLength);

                i = right;
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 4, 7, 3, 2, 5};
        System.out.println("Longest mountain length: " + longestMountain(arr1)); 

        int[] arr2 = {2, 2, 2};
        System.out.println("Longest mountain length: " + longestMountain(arr2)); 
    }
}

