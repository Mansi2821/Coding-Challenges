import java.util.*;

// Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
// Example 1:
// Input: head = [1,2,6,3,4,5,6], val = 6
// Output: [1,2,3,4,5]
// Example 2:

// Input: head = [], val = 1
// Output: []



// class Solution_203 {
//   public ListNode removeElements(ListNode head, int val) {
//     ListNode dummy = new ListNode(0, head);
//     ListNode prev = dummy;

//     for (; head != null; head = head.next)
//       if (head.val != val) {
//         prev.next = head;
//         prev = prev.next;
//       }
//     prev.next = null; // In case that the last value equals `val`.

//     return dummy.next;
//   }
// }