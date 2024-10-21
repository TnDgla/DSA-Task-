class Solution {
    public List<String> commonChars(String[] words) {
        Map<Character,Integer> map = new HashMap<>();
        String first = words[0];

        for(int i =0; i<first.length(); i++){
            map.put(first.charAt(i), map.getOrDefault(first.charAt(i),0)+1);
        }


        for(int i=1; i<words.length; i++){
            Map<Character,Integer> currMap = new HashMap<>();
            String curr = words[i];

         
            for(int j =0; j<curr.length(); j++){
                currMap.put(curr.charAt(j), currMap.getOrDefault(curr.charAt(j),0)+1);
            }

            for(Character key : map.keySet()){
                map.put(key, Math.min(map.get(key),currMap.getOrDefault(key,0)));
            }

        }

      
        List<String> result= new ArrayList<>();
        for(Character key : map.keySet()){
            for(int i=0; i<map.get(key);i++){
                result.add(key.toString());
            }
        }
        return result;
    }
}
