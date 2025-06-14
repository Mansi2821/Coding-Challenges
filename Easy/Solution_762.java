//  Given two integers left and right, return the count of numbers in the inclusive range [left, right] having a prime number of set bits in their binary representation.

// Recall that the number of set bits an integer has is the number of 1's present when written in binary.

class Solution_762 {
    public int countPrimeSetBits(int left, int right) {
        // Set of primes up to 20 (max set bits for numbers <= 10^6)
        boolean[] isPrime = new boolean[21];
        isPrime[2] = true;
        isPrime[3] = true;
        isPrime[5] = true;
        isPrime[7] = true;
        isPrime[11] = true;
        isPrime[13] = true;
        isPrime[17] = true;
        isPrime[19] = true;

        int count = 0;

        for (int i = left; i <= right; i++) {
            int setBits = Integer.bitCount(i); // Efficiently counts 1's in binary
            if (isPrime[setBits]) {
                count++;
            }
        }

        return count;
    }
}
