class Solution {
    public int maximumUniqueSubarray(int[] n) {
        int i=0,j=0,s=0,p=0,k=n.length;
        Set<Integer> nm=new HashSet<>();
        while(i<k&&j<k)
        {
            if(!nm.contains(n[j]))
            {
                s+=n[j];
                p=Math.max(p,s);
                nm.add(n[j++]);
            }
            else
            {
                s-=n[i];
                nm.remove(n[i++]);
            }
        }
        return p;
    }
}