// Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

// Each letter in magazine can only be used once in ransomNote.

 

// Example 1:

// Input: ransomNote = "a", magazine = "b"
// Output: false


import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineLetters = new HashMap<>();
        
        // Count each letter in magazine
        for (char c : magazine.toCharArray()) {
            magazineLetters.put(c, magazineLetters.getOrDefault(c, 0) + 1);
        }
        
        // Check if we can construct ransomNote from magazine
        for (char c : ransomNote.toCharArray()) {
            if (!magazineLetters.containsKey(c) || magazineLetters.get(c) <= 0) {
                return false;
            }
            magazineLetters.put(c, magazineLetters.get(c) - 1);
        }
        
        return true;
    }
}