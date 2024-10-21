```java

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int[][] arr=new int[n/3][3];
        int i=0,j=0,m=0;
        while(i<n/3){
            arr[i][j]=nums[m];                             
            m++;
            j++;
            if(j==3){
                j=0;
                i++;
            }            
        }
        i=0;
        j=0;
        while(i<n/3){
            if(Math.abs(arr[i][0]-arr[i][j])>k) return new int[][]{}; 
            j++;
            if(j==3){
                j=0;
                i++;
            }  
        }
        
        return arr;
    }
}
    
```