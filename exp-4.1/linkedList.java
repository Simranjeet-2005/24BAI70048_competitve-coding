import java.util.*;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
public class linkedList {
    public static boolean linklist(node head){
        node slow=head;
        node fast=head;
        if (head==null || head.next==null)
            return true;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        node prev = null;
        node curr = slow;
        while (curr != null) {
            node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        node first = head;
        node second = prev;
        while(second!=null) {
            if (first.data!=second.data) {
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of nodes");
        int n=sc.nextInt();
        node head=null;
        node tail=null;
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            node newNode=new node(x);

            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
        }

        System.out.println(linklist(head));
    }
}
