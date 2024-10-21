public class LongestMountain {
    public int longestMountain(int[] arr) {
        if(arr.length<3) return 0;
        int max = 0;
        int i=0;
        int j=1;
        int n=arr.length;
        while(j<n){

            boolean eq = false;
            while(j<n && arr[j]==arr[j-1]){
                eq = true;
                j++;
            }
            if(eq){
                i=j-1;
            }

            boolean h = true;

            while(j<n && arr[j]>arr[j-1]){
                h = false;
                j++;
            }
            boolean l = true;
            while(j<n && arr[j]<arr[j-1]){
                l = false;
                j++;
            }

            if(l || h) max = Math.max(max, 0);
            else{
                max = Math.max(max, j-i);
            }

            i=j-1;
        }
        return max;
    }
}
