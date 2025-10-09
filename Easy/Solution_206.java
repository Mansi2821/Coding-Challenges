// Given the head of a singly linked list, reverse the list, and return the reversed list.
// Example 1:
// Input: head = [1,2,3,4,5]
// Output: [5,4,3,2,1]

// class Solution_206 {
//   public ListNode reverseList(ListNode head) {
//     if (head == null || head.next == null)
//       return head;

//     ListNode newHead = reverseList(head.next);
//     head.next.next = head;
//     head.next = null;
//     return newHead;
//   }
// }