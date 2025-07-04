// Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).

 

// Example 1:

// Input: n = 11

// Output: 3

// Explanation:

// The input binary string 1011 has a total of three set bits.





public class Solution_191 {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>>= 1; // Use unsigned right shift to handle negative numbers correctly
        }
        return count;
    }
}
