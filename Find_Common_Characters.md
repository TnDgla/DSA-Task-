``` java

class Solution {
    public List<String> commonChars(String[] words) {
        ArrayList<String> ll=new ArrayList<>();
        for(char ch='a'; ch<='z'; ch++){
            int mincount= Integer.MAX_VALUE;

            for(String word: words){
                int count= 0;
                for(char c: word.toCharArray()){
                    if (c==ch){
                        count++;
                    }
                }
                mincount= Math.min(mincount, count);
            }
            for(int i=0; i<mincount; i++){
                ll.add(String.valueOf(ch));
            }
        }
        return ll;
        
    }
}
```