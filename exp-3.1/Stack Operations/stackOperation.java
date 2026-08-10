import java.util.*;
class StackOperations{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<Integer> s=new Stack<>();
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
            s.push(sc.nextInt());
        System.out.println("Stack: "+s);
        System.out.println("Top element: "+s.peek());
        System.out.println("Popped element: "+s.pop());
        System.out.println("Stack after pop: "+s);
        System.out.print("Enter element to push: ");
        int x=sc.nextInt();
        s.push(x);
        System.out.println("Stack after push: "+s);
    }
}