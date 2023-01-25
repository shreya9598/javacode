import java.util.*;

class linkedlist
{
    class Node
    {
        public Node prev,next;
        public int val;
        Node(int x)
        {
            prev=null;
            next=null;
            val=x;
        }
    }
    Node head;
    public void addAtEnd(int x)
    {
        Node temp=new Node(x);
        if(head == null)
        {
            temp.prev=null;
            head=temp;
            return;
        }
        
        temp.next=null;
        Node itr=head;
        while(itr.next!=null)
        {
            itr=itr.next;
        }
        itr.next=temp;
        temp.prev=itr;
    } 

    public void delete(int pos)
    {
        if(head ==null)
            return;
        
        Node temp=head;
        int i=1;
        while(i<pos)
        {
            temp=temp.next;
            i++;
        }
        if(temp ==head)
        {
            head=temp.next;
        }
        else
        {
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
        }
        temp=null;
    }
    public int size()
    {
        int cnt=1;
        Node temp=head;
        while(temp.next!=null)
        {
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
    public void print()
    {
        if(head ==null)
        {
            System.out.println("empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+ " ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void clear()
    {
        head=null;
    }
    public boolean contains(int x)
    {
        Node temp=head;
        while(temp.next!=null)
        {
            if(temp.val == x)
                return true;
            temp=temp.next;
        }
        return false;
    }
    public HashSet<Integer> toSet()
    {
        HashSet<Integer> st=new HashSet<>();
        Node temp=head;
        while(temp.next!=null)
        {
            st.add(temp.val);
            temp=temp.next;
        }
        return st;
    }
    public ArrayList<Integer> toList()
    {
        ArrayList<Integer> arr=new ArrayList<>();
        Node temp =head;
        while(temp.next!=null)
        {
            arr.add(temp.val);
            temp=temp.next;
        }
        return arr;
    }
    public void reverse()
    {
        Node temp = null;
        
        Node itr= head;  
        while (itr!= null) {
            temp = itr.prev;
            itr.prev = itr.next;
            itr.next = temp;
            itr =itr.prev;
        }
        if (temp!= null) {
            head=temp.prev;
        }
    }
    public linkedlist copy()
    {
        linkedlist temp= new linkedlist();
        Node itr=head;
        while(itr!=null)
        {
            temp.addAtEnd(itr.val);
            itr=itr.next;
        }
        return temp;
    }   
    
}



