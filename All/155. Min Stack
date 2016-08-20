class Node
{
    int val;
    int min;
    Node next;
    Node(int x)
    {
        val = x;
        min = x;
        next = null;
    }
}

public class MinStack
{
    Node head;
    /** initialize your data structure here. */
    public MinStack()
    {
        head = null;
    }
    
    public void push(int x)
    {
        if(head == null)
            head = new Node(x);
        else
        {
            Node t = new Node(x);
            t.min = Math.min(x, head.min);
            t.next = head;
            head =t;
        }
    }
    
    public void pop()
    {
        if(head != null)
            head = head.next;
        else
            throw new IllegalArgumentException("Empty Stack");
        
    }
    
    public int top()
    {
        if(head != null)
            return head.val;
        else
            throw new IllegalArgumentException("Empty Stack");
    }
    
    public int getMin()
    {
        if(head != null)
            return head.min;
        else
            throw new IllegalArgumentException("Empty Stack");
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
