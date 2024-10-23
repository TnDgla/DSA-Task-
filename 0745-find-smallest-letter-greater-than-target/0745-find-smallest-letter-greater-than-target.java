class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
    
    
        int left = 0;
        int right = letters.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (letters[mid] <= target) {
                left = mid + 1;  // Move right to find a greater character
            } else {
                right = mid - 1;  // Move left to find a smaller greater character
            }
        }

        // If left goes out of bounds, wrap around by returning the first character
        return letters[left % letters.length];
    }
}

          
   