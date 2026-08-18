import java.util.HashSet;
import java.util.Scanner;
public class Solution {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
    public static boolean hasCycle(ListNode head) {
        HashSet<ListNode> set=new HashSet<>();
        ListNode current=head;
        while(current!=null){
            if(set.contains(current)){
                return true;
            }
            set.add(current);
            current = current.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n=sc.nextInt();
        ListNode head=null;
        ListNode tail=null;
        System.out.println("Enter node values:");
        for (int i = 0; i < n; i++) {
           int value = sc.nextInt();
            ListNode newNode = new ListNode(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        System.out.print("Enter cycle position (-1 for no cycle): ");
        int pos = sc.nextInt();      
        if (pos != -1) {
            ListNode cycleNode = head;
            for (int i = 0; i < pos; i++) {
                cycleNode = cycleNode.next;
            }
            tail.next = cycleNode;
        }
        if (hasCycle(head)) {
            System.out.println("Cycle detected");
        } else {
            System.out.println("No cycle");
        }
        sc.close();
    }
}