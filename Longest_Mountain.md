``` java

class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        if (n < 3) return 0; 

        int maxLength = 0;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                int x = i;
                int y = i;

                while (x > 0 && arr[x - 1] < arr[x]) {
                    x--;
                }

                while (y < n - 1 && arr[y + 1] < arr[y]) {
                    y++;
                }

                int currentLength = y - x + 1;
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }
}
```
