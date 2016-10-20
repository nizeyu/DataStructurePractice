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
    public void reorderList(ListNode head)
    {
        if(head == null || head.next == null)
            return;
        
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast.next != null && fast.next.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        ListNode head2 = slow.next;
        slow.next = null;
        
        head2 = reverse(head2);
        
        merge(head, head2);
    }
    
    private ListNode reverse(ListNode head)
    {
        if(head == null || head.next == null)
            return head;
        
        ListNode p = head;
        ListNode q = head.next;
        
        while(p != null && q != null)
        {
            ListNode t = q.next;
            q.next = p;
            p = q;
            
            if(t != null)
                q = t;
            else
                break;
        }
        head.next = null;
        
        return p;
    }
    
    private void merge(ListNode l1, ListNode l2)
    {
        ListNode dummyNode = new ListNode(0);
        ListNode p = dummyNode;
        
        while(l2 != null)
        {
            p.next = l1;
            l1 = l1.next;
            p = p.next;
            
            p.next = l2;
            l2 = l2.next;
            p = p.next;
        }
        
        if(l1 != null) p.next = l1;
    }
}
