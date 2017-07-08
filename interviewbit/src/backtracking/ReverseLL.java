package src.backtracking;

/**
 * Created by kartik on 8/7/17.
 */
public class ReverseLL {
    public static Node f =null;
    public static void main(String[] args) {
        Node h= new Node(1);
        h.next=new Node(2);
        h.next.next=new Node(3);
        h.next.next.next=new Node(4);
        h.next.next.next.next=new Node(5);
        printList(h);
        reverseLL(null,h);
        printList(f);
    }

    public static void printList(Node h){
        Node tmp=h;
        while(tmp!=null){
            System.out.println(tmp.value);
            tmp=tmp.next;
        }
    }

    public static void reverseLL(Node prev,Node h){
        if(h.next==null){
            f=h;
            f.next=prev;
            return;
        }
        reverseLL(h,h.next);
        h.next=prev;
    }

    public static class Node{
        int value;
        Node next;
        Node(int x){
            this.value=x;
            this.next=null;
        }
    }
}
