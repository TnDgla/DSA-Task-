class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1)
        return x;
        int start=0;
        int end=x;
        int mid=(start+end)/2;
        while(end-start>1){
            mid=(start+end)/2;
            if((long)mid*mid > x){
                end = mid;
            }
            else if((long)mid*mid < x){
                start=mid;
            }
            else{
                return mid;
            }
        }
        if((long)mid*mid>x)
        return mid-1;
        else
        return mid;
    }
}