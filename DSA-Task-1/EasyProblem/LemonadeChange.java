class Solution {
    public boolean lemonadeChange(int[] bills) {
        int arr[]=new int[]{0,0,0};//5,10,20
        for(int i:bills){
            if(i==5){
                arr[0]++;
            }
            else if(i==10){
                if(arr[0]==0){
                    return false;
                }
                arr[0]--;
                arr[1]++;
            }
            else{
                if(arr[1]>=1 && arr[0]>=1){
                    arr[1]--;
                    arr[0]--;
                    arr[2]++;
                }else if(arr[0]>=3){
                    arr[0]-=3;
                    arr[2]++;
                }else{
                    // System.out.println(Arrays.toString(arr));
                    return false;
                }
                // System.out.println(Arrays.toString(arr));
            }
        }
        
        return true;
    }
}