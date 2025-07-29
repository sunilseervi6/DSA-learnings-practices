/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle( ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
        if(fast == null || fast.next == null) return null;
        ListNode temp = head;
        while(temp != slow){
            temp= temp.next;
            slow=slow.next;
        }
        return slow;
    }
    
}

/*

public class Solution {
    public int cycleLength( ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                int count =0;
                ListNode temp = slow;
                do{
                    temp=temp.next;
                    count++;
                }while(temp != slow);
                return count;
            }
        }
        return 0;
    }
    public ListNode detectCycle(ListNode head){
        int length=0;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                length = cycleLength(slow);
                break;
            }
        }
        if(length ==0){
            return null;
        }
        //find start
        ListNode f = head;
        ListNode s = head;
        while(length > 0){
            s=s.next;
            length--;
        }
        //keep moving both forward
        while(f!=s){
            f=f.next;
            s=s.next;
        }
        return s;
    }
}
*/
