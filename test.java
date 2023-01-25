import java.util.*;
public class test {
    public static void main(String[] args) {
        linkedlist ll= new linkedlist();
        ll.addAtEnd(4);
        ll.addAtEnd(5);
        ll.addAtEnd(6);
        ll.addAtEnd(2);
        ll.addAtEnd(4);
        ll.print();
        //ll.clear();
        //ll.print();
        //ll.reverse();
        //ll.print();
        //ll.delete(2);
        //ll.print();
        //System.out.println(ll.size());
        //System.out.println(ll.contains(5));
        //System.out.println(ll.contains(1));
        ArrayList<Integer> arr =new ArrayList<>();
        arr=ll.toList();
        System.out.println(arr);
        HashSet<Integer> st =new HashSet<>();
        st=ll.toSet();
        System.out.println(st);
        linkedlist l2=ll.copy();
        l2.print();


        /*S st=new S();
        st.add(10);
        st.add(13);
        st.add(20);
        st.add(1);
        st.print();
        System.out.println(st.top());
        System.out.println(st.isFull());
        st.remove();
        st.print();
        st.add(5);
        st.print();*/
    }
}
