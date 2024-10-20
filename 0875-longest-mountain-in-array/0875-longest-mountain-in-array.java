class Solution {
    public int longestMountain(int[] arr) {
        int maxLength = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int s = i;
            while (i < arr.length - 1 && arr[i] < arr[i + 1]) i++;
            int p = i; 
            if (p == s) continue;
            while (i < arr.length - 1 && arr[i] > arr[i + 1]) i++;
            int e = i;
            if (p == e) continue;
            int mountainLength = e - s + 1;
            maxLength = Math.max(maxLength, mountainLength);
            i--;
        }
        return maxLength;
    }
}