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
    public ListNode partition(ListNode head, int x)
    {
        if(head == null || head.next == null)
            return head;
        
        ListNode dummyNode1 = new ListNode(0);
        dummyNode1.next = head;
        ListNode m = dummyNode1;
        
        ListNode dummyNode2 = new ListNode(0);
        ListNode n = dummyNode2;
        
        while(m.next != null)
        {
            if(m.next.val < x)
                m = m.next;
            else
            {
                n.next = m.next;
                m.next = m.next.next;
                n = n.next;
            }
        }
        
        m.next = dummyNode2.next;
        n.next = null;
        
        return dummyNode1.next;
    }
}
