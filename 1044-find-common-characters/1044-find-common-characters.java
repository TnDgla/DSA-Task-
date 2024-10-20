class Solution {
    public List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();
        Map<Character, Integer> map = freqMap(words[0]);

        for (int i = 1; i < words.length; i++) {
            Map<Character, Integer> currentMap = freqMap(words[i]);

            for (char c : map.keySet()) {
                if (currentMap.containsKey(c)) {
                    map.put(c, Math.min(map.get(c), currentMap.get(c)));
                } else {
                    map.put(c, 0);
                }
            }
        }

        for (char c : map.keySet()) {
            int count = map.get(c);
            for (int i = 0; i < count; i++) {
                list.add(String.valueOf(c));
            }
        }
        return list;
    }

    Map<Character, Integer> freqMap(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            map.put(word.charAt(i), map.getOrDefault(word.charAt(i), 0) + 1);
        }
        return map;
    }
}