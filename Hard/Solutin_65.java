// Given a string s, return whether s is a valid number.

// For example, all the following are valid numbers: "2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7", "+6e-1", "53.5e93", "-123.456e789", while the following are not valid numbers: "abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3", "95a54e53".

// Formally, a valid number is defined using one of the following definitions:

// An integer number followed by an optional exponent.
// A decimal number followed by an optional exponent.
// An integer number is defined with an optional sign '-' or '+' followed by digits.

// A decimal number is defined with an optional sign '-' or '+' followed by one of the following definitions:

// Digits followed by a dot '.'.
// Digits followed by a dot '.' followed by digits.
// A dot '.' followed by digits.
// An exponent is defined with an exponent notation 'e' or 'E' followed by an integer number.

// The digits are defined as one or more digits.

// Example 1:

// Input: s = "0"

// Output: true

// Example 2:

// Input: s = "e"

// Output: false


class Solution_65 {
  public boolean isNumber(String s) {
    s = s.trim();
    if (s.isEmpty())
      return false;

    boolean seenNum = false;
    boolean seenDot = false;
    boolean seenE = false;

    for (int i = 0; i < s.length(); ++i) {
      switch (s.charAt(i)) {
        case '.':
          if (seenDot || seenE)
            return false;
          seenDot = true;
          break;
        case 'e':
        case 'E':
          if (seenE || !seenNum)
            return false;
          seenE = true;
          seenNum = false;
          break;
        case '+':
        case '-':
          if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')
            return false;
          seenNum = false;
          break;
        default:
          if (!Character.isDigit(s.charAt(i)))
            return false;
          seenNum = true;
      }
    }

    return seenNum;
  }
}