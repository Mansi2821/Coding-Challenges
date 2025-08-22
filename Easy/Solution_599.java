import java.util.*;

// Given two arrays of strings list1 and list2, find the common strings with the least index sum.

// A common string is a string that appeared in both list1 and list2.

// A common string with the least index sum is a common string such that if it appeared at list1[i] and list2[j] then i + j should be the minimum value among all the other common strings.

// Return all the common strings with the least index sum. Return the answer in any order.

 

// Example 1:

// Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"]
// Output: ["Shogun"]
// Explanation: The only common string is "Shogun".



class Solution_599 {
  public String[] findRestaurant(String[] list1, String[] list2) {
    List<String> ans = new LinkedList<>();
    Map<String, Integer> restaurantToIndex = new HashMap<>();
    int minSum = Integer.MAX_VALUE;

    for (int i = 0; i < list1.length; ++i)
      restaurantToIndex.put(list1[i], i);

    for (int i = 0; i < list2.length; ++i) {
      final String restaurant = list2[i];
      if (restaurantToIndex.containsKey(restaurant)) {
        final int sum = restaurantToIndex.get(restaurant) + i;
        if (sum < minSum) {
          minSum = sum;
          ans.clear();
          ans.add(restaurant);
        } else if (sum == minSum) {
          ans.add(restaurant);
        }
      }
    }

    return ans.toArray(new String[0]);
  }
}