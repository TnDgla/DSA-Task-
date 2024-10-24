```java
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int m = matrix.length;
 
      if(m==0){
        return false;
      }  
  
      int n = matrix[0].length;

    
      int low=0, high = m*n-1;
      int Mid_idx, Mid_Element, row_idx, col_idx;
      while(low<=high){
        Mid_idx = low+(high-low)/2;
        row_idx = Mid_idx/n;
        col_idx = Mid_idx%n;

        Mid_Element = matrix[row_idx][col_idx];
        if(target == Mid_Element){
            return true;
        }
        else{
            if(Mid_Element <target ){
                low = Mid_idx+1;
            }
            else{
                high = Mid_idx-1;

            }

        }
      }
      return false;
    }
}
```