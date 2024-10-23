package week1;
import java.util.*;
class Water{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Water ob=new Water();
        System.out.println(ob.maxArea(a));
    }
   
        public int maxArea(int[] height) {
            int max_ar=0,l=0,r=height.length-1;
            while(l<r){
                int cur_area=Math.min(height[l],height[r])*(r-l);
                max_ar=Math.max(cur_area,max_ar);
                if(height[l] < height[r])
                l=l+1;
                else
                r=r-1;
            }
            return max_ar;
        }
    
    
}