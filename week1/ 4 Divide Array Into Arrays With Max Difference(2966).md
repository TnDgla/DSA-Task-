```java
class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length;
        if (len % 3 != 0) {
            return new int[0][0];
        }
        int[][] ans = new int[len / 3][3];
        int r = 0, c = 0;
        for (int i = 0; i < len; i++) {
            ans[r][c] = nums[i];
            c++;
            if (c == 3) {
                if (ans[r][2] - ans[r][0] > k) {
                    return new int[0][0];
                }
                c = 0;
                r++;
            }
        }
        return ans;
    }
}

```