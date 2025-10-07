// Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

// Example 1:

// Input: s = "abab"
// Output: true
// Explanation: It is the substring "ab" twice.
// Example 2:

// Input: s = "aba"
// Output: false

class Solution_459 {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for(int i = len/2; i>0; i--){
            if(len%i == 0){
                int num_substrings = len/i;
                StringBuilder sb = new StringBuilder();
                String str = s.substring(0,i);

                for(int j = 0; j < num_substrings; j++){
                    sb.append(str);
                }
                if (sb.toString().equals(s)) return true;
            }
        }
        return false;
        
    }
}