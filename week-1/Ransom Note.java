class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        // HashMap<Character,Integer> map=new HashMap<>();
        // for(int i=0;i<magazine.length();i++){
        //     map.put(magazine.charAt(i),map.getOrDefault(magazine.charAt(i),0)+1);
        // }
        // for(int i=0;i<ransomNote.length();i++){
        //     char ch=ransomNote.charAt(i);
        //     if(!map.containsKey(ch)){
        //         return false;
        //     }
        //     map.put(ch,map.getOrDefault(ch,0)-1);
        //     if(map.get(ch)==0){
        //         map.remove(ch);
        //     }
        // }
        // return true;
        int[] arr=new int[26];
       for(Character ch:magazine.toCharArray()){
            arr[ch-'a']++;
        }
        for(Character c:ransomNote.toCharArray()){
            if(arr[c-'a']==0){
                return false;
            }
            arr[c-'a']--;
        }
        return true;
    }
}
