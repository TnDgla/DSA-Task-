class Solution {
    public int getCommon(int[] a, int[] b) {
        int i=0;
        int j=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]==b[j])  return a[i];
            
            else if(b[j]<a[i])  j++;

            else  i++;
        }
        return -1;
    }
}
