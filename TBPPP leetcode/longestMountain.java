class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int maxLength = 0;
        
        // Iterate through the array
        for (int i = 1; i < n - 1; i++) {
            // Check if arr[i] is a peak
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                // Expand to the left
                int left = i - 1;
                while (left >= 0 && arr[left] < arr[left + 1]) {
                    left--;
                }
                
                // Expand to the right
                int right = i + 1;
                while (right < n && arr[right] < arr[right - 1]) {
                    right++;
                }
                
                // Calculate the mountain length
                maxLength = Math.max(maxLength, right - left - 1);
            }
        }
        
        return maxLength; // Return the maximum mountain length found
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] arr1 = {2, 1, 4, 7, 3, 2, 5};
        System.out.println(solution.longestMountain(arr1)); // Output: 5

        // Test case 2
        int[] arr2 = {2, 2, 2};
        System.out.println(solution.longestMountain(arr2)); // Output: 0
    }
}
