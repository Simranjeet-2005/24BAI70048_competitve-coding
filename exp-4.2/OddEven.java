import java.util.*;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
public class OddEven {
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
        node odd=head;
        node even=head.next;
        node evenHead=even;
        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}
