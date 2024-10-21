import java.util.*;

public class NiceSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0) nums[i] = 0;
            else {
                list.add(i);
                nums[i] = 1;
            }
        }

        if(list.size()<k) return 0;

        int i,j,lastOdd,odds,total;
        i=j=lastOdd=total=odds=0;

        while(j<nums.length){

            while(j<nums.length && odds<k){
                if(nums[j]==1){
                    odds++;
                    if(odds==k) lastOdd = j;
                }
                j++;
            }

            while(j<nums.length && nums[j]==0) j++;
            j--;

            total+=((list.get(0)-i+1)*(j-lastOdd+1));
            i = list.get(0)+1;
            list.remove(0);
            odds--;
            j++;

        }

        return total;
    }
}
