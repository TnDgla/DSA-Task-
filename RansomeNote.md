```java
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>map=new HashMap<>();
                        

        for(int i=0;i<magazine.length();i++){
            char word=magazine.charAt(i);
            if(!map.containsKey(word)){
                map.put(word,1);
            }else{
                map.put(word,map.get(word)+1);
             }
          }
        for(int i=0;i<ransomNote.length();i++){
            char word=ransomNote.charAt(i);
            if(map.containsKey(word) && map.get(word)>0){
                map.put(word,map.get(word)-1);
           }
            else {
            return false;
        }
    }
    return true;
        }
}
```