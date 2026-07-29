import java.util.*;
public class StackUsingTwoQueues {
    static Queue<Integer> q1=new LinkedList<>();
    static Queue<Integer> q2=new LinkedList<>();
    static void push(int x){
        q2.add(x);
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    static void pop(){
        if (q1.isEmpty()){
            System.out.println("Stack is Empty");
        }else{
            System.out.println("Popped Element: " + q1.remove());
        }
    }
    static void peek(){
        if(q1.isEmpty()){
            System.out.println("Stack is Empty");
        }else{
            System.out.println("Top Element: " + q1.peek());
        }
    }
    static void display(){
        if(q1.isEmpty()){
            System.out.println("Stack is Empty");
        }else{
            System.out.println("Stack: " + q1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            int choice=sc.nextInt();
            switch (choice) {
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
                    display();
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