// import java.util.*;
// Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

// Example 1:
// Input: head = [1,2,3,4]
// Output: [2,1,4,3]

// Example 2:
// Input: head = []
// Output: []

// Example 3:
// Input: head = [1]
// Output: [1]

// Example 4:
// Input: head = [1,2,3]
// Output: [2,1,3]


// class Solution_24{
//     ListNode swapPairs(ListNode head){
//         ListNode dummy = new ListNode(0);
//         dummy.next = head;

//         ListNode point = dummy;

//         while(point.next != null && point.next.next != null){
//             ListNode swap1 = point.next;
//             ListNode swap2 = point.next.next;

//             swap1.next = swap2.next;
//             swap2.next = swap1;

//             point.next = swap2;
//             point = swap1;
//         }

//         return dummy.next;
//     }
// }