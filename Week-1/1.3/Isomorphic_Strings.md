```java
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char sCh=s.charAt(i);
            char tCh=t.charAt(i);
            if(map.containsKey(sCh)){
                if(map.get(sCh)!=tCh){
                    return false;
                }
            }
            else if(map.containsValue(tCh)){
                return false;
            }
            else{
                map.put(sCh,tCh);
            }
        }
        return true;
    }
}
```