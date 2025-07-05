// Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.

// Return the largest lucky integer in the array. If there is no lucky integer return -1.

 

// Example 1:

// Input: arr = [2,2,3,4]
// Output: 2
// Explanation: The only lucky number in the array is 2 because frequency[2] == 2.

class Solution_1394 {
    public int findLucky(int[] arr) {
        int maxLucky = -1;
        
        for (int num : arr) {
            int count = 0;
            for (int otherNum : arr) {
                if (otherNum == num) {
                    count++;
                }
            }
            if (count == num && num > maxLucky) {
                maxLucky = num;
            }
        }
        
        return maxLucky;
    }
}
