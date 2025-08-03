//leetcode 2130
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
//fast and slow pointers
class Solution {
    public int pairSum(ListNode head) {
        int max = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        ListNode slow = head;
        ListNode fast = head.next;
        stack.push(slow.val);
      //find the mid value -> slow
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            stack.push(slow.val);
        }
      //add the slow after mid and stack value ...
        while(!stack.isEmpty() &&  slow != null){
            slow = slow.next;
            int val = stack.pop();
            int sum = val + slow.val;
            
            max = Math.max(max, sum);
        }
        return max;
    }
}
