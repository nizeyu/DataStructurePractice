/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution
{
    public ListNode rotateRight(ListNode head, int k)
    {
        if(head == null || k <= 0)
            return head;
        
        int l = 0;
        ListNode p = head;
        while(p != null)
        {
            l++;
            p = p.next;
        }
        
        k %= l;
        
        ListNode fast = head;
        ListNode slow = head;
        
        for(int i = 0; i < k; i++)
            fast = fast.next;
        
        while(fast.next != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        
        fast.next = head;
        head = slow.next;
        slow.next = null;
        
        return head;
        
    }
}
