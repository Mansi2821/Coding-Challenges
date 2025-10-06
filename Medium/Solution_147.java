// import util.ListNode;
import java.util.*;
// Given the head of a singly linked list, sort the list using insertion sort, and return the sorted list's head.

// The steps of the insertion sort algorithm:

// Insertion sort iterates, consuming one input element each repetition and growing a sorted output list.
// At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list and inserts it there.
// It repeats until no input elements remain.
// The following is a graphical example of the insertion sort algorithm. The partially sorted list (black) initially contains only the first element in the list. One element (red) is removed from the input data and inserted in-place into the sorted list with each iteration.

// Input: head = [4,2,1,3]
// Output: [1,2,3,4]

// class Solution_147 {
//   public ListNode insertionSortList(ListNode head) {
//     ListNode dummy = new ListNode(0);
//     ListNode prev = dummy; // the last and thus largest of the sorted list

//     while (head != null) {       // the current inserting node
//       ListNode next = head.next; // Cache the next inserting node.
//       if (prev.val >= head.val)
//         prev = dummy; // Move `prev` to the front.
//       while (prev.next != null && prev.next.val < head.val)
//         prev = prev.next;
//       head.next = prev.next;
//       prev.next = head;
//       head = next; // Update the current inserting node.
//     }

//     return dummy.next;
//   }
// }