// You are given a string s consisting of lowercase English letters ('a' to 'z').

// Your task is to:

// Find the vowel (one of 'a', 'e', 'i', 'o', or 'u') with the maximum frequency.
// Find the consonant (all other letters excluding vowels) with the maximum frequency.
// Return the sum of the two frequencies.

// Note: If multiple vowels or consonants have the same maximum frequency, you may choose any one of them. If there are no vowels or no consonants in the string, consider their frequency as 0.

// The frequency of a letter x is the number of times it occurs in the string.
 

// Example 1:

// Input: s = "successes"

// Output: 6

// Explanation:

// The vowels are: 'u' (frequency 1), 'e' (frequency 2). The maximum frequency is 2.
// The consonants are: 's' (frequency 4), 'c' (frequency 2). The maximum frequency is 4.
// The output is 2 + 4 = 6.


import java.util.*;

class Solution_3541 {
    public int maxFreqSum(String s) {
        String vowels = "aeiou";
        
        // Count frequencies of all characters
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        
        // Find vowel with maximum frequency
        int maxVowelFreq = 0;
        for (char c : freqMap.keySet()) {
            if (vowels.indexOf(c) != -1) {
                maxVowelFreq = Math.max(maxVowelFreq, freqMap.get(c));
            }
        }
        
        // Find consonant with maximum frequency
        int maxConsonantFreq = 0;
        for (char c : freqMap.keySet()) {
            if (vowels.indexOf(c) == -1) {
                maxConsonantFreq = Math.max(maxConsonantFreq, freqMap.get(c));
            }
        }
        
        return maxVowelFreq + maxConsonantFreq;
    }
}