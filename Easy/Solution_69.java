// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

// You must not use any built-in exponent function or operator.

// For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 

// Example 1:

// Input: x = 4
// Output: 2
// Explanation: The square root of 4 is 2, so we return 2.



class Solution_69 {
  public int mySqrt(long x) {
    long l = 1;
    long r = x + 1;

    while (l < r) {
      final long m = (l + r) / 2;
      if (m > x / m)
        r = m;
      else
        l = m + 1;
    }

    // l := the minimum number s.t. l * l > x
    return (int) l - 1;
  }
}