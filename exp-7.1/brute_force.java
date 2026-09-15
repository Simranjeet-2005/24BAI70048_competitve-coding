import java.util.*;
public class brute_force{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num=sc.nextInt();
        while(num >= 10){
            int sum=0;
            while(num > 0){
                sum+=num%10;
                num=num/10;
            }
            num=sum;
        }
        System.out.println("Single digit result: "+num);
    }
}