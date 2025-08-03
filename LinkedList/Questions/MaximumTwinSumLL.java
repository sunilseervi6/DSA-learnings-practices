/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        
        Stack<Integer> stack = new Stack<>();
        ListNode slow = head;
        ListNode fast = head;
        //move slow to the middle while pushing the first half of the linkedlist
        while(fast != null && fast.next != null){
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        int max = Integer.MIN_VALUE;
        //comapare 2nd half of the linkedlist with first half values from the stack
        while(slow != null){
            int twinSum = stack.pop() + slow.val;
            max = Math.max(max, twinSum);
            slow = slow.next;

        }
        return max;
    }
}
