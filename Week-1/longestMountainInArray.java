public class longestMountainInArray {
        public int longestMountain(int[] arr) {
            int peak=0;
            for(int i=1;i<arr.length-1;i++){
                if(arr[i-1] < arr[i] && arr[i] > arr[i+1]){
                    int left = i;
                    int right = i;
                    while( left > 0 && arr[left] > arr[left -1]){
                        left --;
                    }
                    while(right + 1 < arr.length && arr[right] > arr[right+1]){
                        right++;
                    }
    
                    peak = Math.max(peak, (right-left+1));
                }
            }
            return peak;
        }
    }
