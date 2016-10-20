/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution
{
    ListNode h;
    public TreeNode sortedListToBST(ListNode head)
    {
        if(head == null)
            return null;
            
        h = head;
        
        ListNode p = head;
        int l = 0;
        while(p != null)
        {
            p = p.next;
            l++;
        }
        
        return sortedListBST(0, l-1);
    }
    
    private TreeNode sortedListBST(int l, int r)
    {
        if(l > r)
            return null;
        
        int m = l + (r - l) / 2;
        
        TreeNode left = sortedListBST(l, m - 1);
        TreeNode root = new TreeNode(h.val);
        h = h.next;
        TreeNode right = sortedListBST(m + 1, r);
        
        root.left = left;
        root.right = right;
        
        return root;
    }
}
