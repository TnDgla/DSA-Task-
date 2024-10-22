import java.util.*;

class Solution {
    public List<String> commonChars(String[] words) {
        // Initialize frequency array with the first word's frequency
        int[] freqArray = new int[26];
        findFreq(freqArray, words[0]);

        // Compare the frequencies of the rest of the words
        for(int i = 1; i < words.length; i++){
            int[] temp = new int[26];  // Temporary array for each word
            findFreq(temp, words[i]);

            for(int j = 0; j < 26; j++){
                // Update freqArray to store the minimum frequency
                freqArray[j] = Math.min(temp[j], freqArray[j]);
            }
        }

        // Add the common characters to the result list
        List<String> li = new ArrayList<>();
        for(int j = 0; j < 26; j++){
            while(freqArray[j]-- > 0){
                // Add the character corresponding to the index
                li.add(String.valueOf((char)(j + 'a')));
            }
        }
        return li;
    }

    // Helper function to calculate the frequency of characters in a string
    public void findFreq(int[] arr, String s){
        for(char ch : s.toCharArray()){
            arr[ch - 'a']++;
        }
    }
}

