public class Max_Consecutive_Ones {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        int max=0;
        int c=0;
        for(int e : nums){
            if(e==1){
                c++;
                if(max<c){
                    max=c;
                }
            }
            else c=0;
        }
        System.out.println(max);
    }
}
