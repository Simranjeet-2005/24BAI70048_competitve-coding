import java.util.*;
public class QueueUsingSingleStack {
    static Stack<Integer> stack = new Stack<>();
    static int dequeue(){
        if(stack.isEmpty()){
            return -1;
        }
        if(stack.size() == 1){
            return stack.pop();
        }
        int x=stack.pop();
        int item=dequeue();
        stack.push(x);
        return item;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter Element: ");
                    stack.push(sc.nextInt());
                    break;
                case 2:
                    int item=dequeue();
                    if (item==-1)
                        System.out.println("Queue is Empty");
                    else
                        System.out.println("Dequeued Element: "+item);
                    break;
                case 3:
                    System.out.println("Queue: "+stack);
                    break;
                case 4:
                    System.out.println("Exit");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}