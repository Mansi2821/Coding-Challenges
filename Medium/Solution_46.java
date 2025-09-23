import java.util.*;
// Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
// Example 1:

// Input: nums = [1,2,3]
// Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// Example 2:

// Input: nums = [0,1]
// Output: [[0,1],[1,0]]

class Solution_46 {
    private void backtrack(List<List<Integer>> resultList, ArrayList<Integer> templist ,int[] nums){
        if(templist.size() == nums.length){
            resultList.add(new ArrayList<>(templist));
            return;
        }
        for(int number:nums){
            if(templist.contains(number))
                continue;
            templist.add(number);
            backtrack(resultList,templist, nums);
            templist.remove(templist.size()-1);
        }
    }


    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();

    
        backtrack(resultList,new ArrayList<>(), nums);
        return resultList;
        
    }
}