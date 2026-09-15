import java.util.*;
public class digital_root {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num=sc.nextInt();
        int result;
        if(num==0){
            result=0;
        }
        else{
            result=(num-1)%9+1;
        }
        System.out.println("single digit result "+result);
    }
}