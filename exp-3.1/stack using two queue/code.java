import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class palinUsingArr{
    public static boolean isPalindrome(Node head){
        ArrayList<Integer> arr=new ArrayList<>();
        while(head!=null){
            arr.add(head.data);
            head=head.next;
        }
        int left=0;
        int right=arr.size()-1;
        while(left<right){
            if(!arr.get(left).equals(arr.get(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n=sc.nextInt();
        Node head=null;
        Node temp=null;
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            Node newNode=new Node(x);
            if(head == null){
                head=newNode;
                temp=newNode;
            } else {
                temp.next=newNode;
                temp=newNode;
            }
        }
            System.out.println(isPalindrome(head));
    }
}