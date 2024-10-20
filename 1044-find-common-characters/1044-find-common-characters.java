class Solution {
    public List<String> commonChars(String[] words) {
        Map<Character, Integer> hmap = new HashMap<>();
        for (char c : words[0].toCharArray()) {
            hmap.put(c, hmap.getOrDefault(c, 0) + 1);
        }

        for (int i = 1; i < words.length; i++) {
            Map<Character, Integer> freq_word = new HashMap<>();
            for (char c : words[i].toCharArray()) {
                freq_word.put(c, freq_word.getOrDefault(c, 0) + 1);
            }

            for (char key : hmap.keySet()) {
                hmap.put(key, Math.min(hmap.getOrDefault(key, 0), freq_word.getOrDefault(key, 0)));
            }
        }

        List<String> list = new ArrayList<>();
        for (char key : hmap.keySet()) {
            for (int i = 0; i < hmap.get(key); i++) {
                list.add(String.valueOf(key));
            }
        }

        return list;
    }
}