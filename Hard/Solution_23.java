import java.util.*;
// You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

// Merge all the linked-lists into one sorted linked-list and return it.

 

// Example 1:

// Input: lists = [[1,4,5],[1,3,4],[2,6]]
// Output: [1,1,2,3,4,4,5,6]
// Explanation: The linked-lists are:
// [
//   1->4->5,
//   1->3->4,
//   2->6
// ]
// merging them into one sorted linked list:
// 1->1->2->3->4->4->5->6
// Example 2:

// Input: lists = []
// Output: []


// class Solution_23 {
//   public ListNode mergeKLists(ListNode[] lists) {
//     ListNode dummy = new ListNode(0);
//     ListNode curr = dummy;
//     Queue<ListNode> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));

//     for (final ListNode list : lists)
//       if (list != null)
//         minHeap.offer(list);

//     while (!minHeap.isEmpty()) {
//       ListNode minNode = minHeap.poll();
//       if (minNode.next != null)
//         minHeap.offer(minNode.next);
//       curr.next = minNode;
//       curr = curr.next;
//     }

//     return dummy.next;
//   }
// }