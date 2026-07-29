import java.util.*;
public class StackUsingQueue {
    static Queue<Integer> q = new LinkedList<>();
        static void push(int x){
        q.add(x);
                for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
    }
    static void pop(){
        if(q.isEmpty()){
            System.out.println("Stack is Empty");
        }else{
            System.out.println("Popped Element: " + q.remove());
        }
    }
    static void peek() {
        if(q.isEmpty()) {
            System.out.println("Stack is Empty");
        }else{
            System.out.println("Top Element: " + q.peek());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter Element: ");
                    int x = sc.nextInt();
                    push(x);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    System.out.println("Stack: "+q);
                    break;
                case 5:
                    System.out.println("Exit");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}