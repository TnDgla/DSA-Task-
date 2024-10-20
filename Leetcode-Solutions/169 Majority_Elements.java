class Solution {
    public boolean check(int[] arr) {
        int drop = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i - 1] > arr[i]){
                drop++;
            }
        }

        if(arr[0] < arr[arr.length - 1]) drop++;
        return drop <= 1;
    }
}
