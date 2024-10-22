public class longest_mountain_in_array {
    public int longestMountain(int[] arr) {
        int max = 0;

        for(int i = 1; i < arr.length-1; i++) {
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]) {
                int left = i-1;
                int right = i+1;

                while(left > 0 && arr[left-1] < arr[left]) left--;
                while(right < arr.length-1 && arr[right] > arr[right+1]) right++;

                max = Math.max(max, right-left+1);
            }
        }
        return max;
    }
}
