import java.util.*;
class QueueOperations{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Queue<Integer> q=new LinkedList<>();
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
       System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
            q.add(sc.nextInt());
        System.out.println("Queue: "+q);
        System.out.println("Front element: "+q.peek());
        System.out.println("Deleted element: "+q.remove());
        System.out.println("Queue after dequeue: "+q);
        System.out.print("Enter element to enqueue: ");
        int x=sc.nextInt();
        q.add(x);
        System.out.println("Queue after enqueue: "+q);
    }
}