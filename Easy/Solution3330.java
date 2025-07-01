// Alice is attempting to type a specific string on her computer. However, she tends to be clumsy and may press a key for too long, resulting in a character being typed multiple times.

// Although Alice tried to focus on her typing, she is aware that she may still have done this at most once.

// You are given a string word, which represents the final output displayed on Alice's screen.

// Return the total number of possible original strings that Alice might have intended to type.

 

// Example 1:

// Input: word = "abbcccc"

// Output: 5

// Explanation:

// The possible strings are: "abbcccc", "abbccc", "abbcc", "abbc", and "abcccc".





import java.util.ArrayList;
import java.util.List;

class Solution_3330 {
    public int possibleStringCount(String word) {
        if (word.length() == 0) return 0;
        
        List<Integer> runLengths = new ArrayList<>();
        char currentChar = word.charAt(0);
        int currentLength = 1;
        
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == currentChar) {
                currentLength++;
            } else {
                if (currentLength >= 2) {
                    runLengths.add(currentLength);
                }
                currentChar = word.charAt(i);
                currentLength = 1;
            }
        }
        if (currentLength >= 2) {
            runLengths.add(currentLength);
        }
        
        int total = 0;
        for (int len : runLengths) {
            total += (len - 1);
        }
        
        // The original string could also be the input string itself (no mistake made)
        total += 1;
        
        return total;
    }
}