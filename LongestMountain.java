public class LongestMountain {
    public int longestMountain(int[] arr) {
        int res=0;
        int n=arr.length;
        for(int i=1;i<n;i++){
            int count=1;
            boolean flag=false;
            int j=i;
            //increasing order
            while(j<n && arr[j]>arr[j-1]){ //arr[j] represents index 1
                j++;
                count++;
            }
            //decreasing order
            while(i!=j && j<n && arr[j]<arr[j-1]){
                j++;
                count++;
                flag=true;
            }
            if(i!=j && count>2 && flag){
                res=Math.max(res,count);
                j--;
            }
            i=j;
        }
        return res;
    }
}
