// Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.

// The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.

// Return the quotient after dividing dividend by divisor.

// Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231, 231 − 1]. For this problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1, and if the quotient is strictly less than -231, then return -231.

 

// Example 1:

// Input: dividend = 10, divisor = 3
// Output: 3
// Explanation: 10/3 = 3.33333.. which is truncated to 3.
// Example 2:

// Input: dividend = 7, divisor = -3
// Output: -2
// Explanation: 7/-3 = -2.33333.. which is truncated to -2.



class Solution_29 {
  public int divide(long dividend, long divisor) {
    // -2^{31} / -1 = 2^31 will overflow, so return 2^31 - 1.
    if (dividend == Integer.MIN_VALUE && divisor == -1)
      return Integer.MAX_VALUE;

    final int sign = dividend > 0 ^ divisor > 0 ? -1 : 1;
    long ans = 0;
    long dvd = Math.abs(dividend);
    long dvs = Math.abs(divisor);

    while (dvd >= dvs) {
      long k = 1;
      while (k * 2 * dvs <= dvd)
        k *= 2;
      dvd -= k * dvs;
      ans += k;
    }

    return sign * (int) ans;
  }
}