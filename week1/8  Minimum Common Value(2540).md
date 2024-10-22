```java
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int minCommon = Integer.MAX_VALUE; 
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                minCommon = Math.min(minCommon, nums1[i]);
                i++; 
                j++;
            }
        }
        
        return minCommon == Integer.MAX_VALUE ? -1 : minCommon;
    }
}

```