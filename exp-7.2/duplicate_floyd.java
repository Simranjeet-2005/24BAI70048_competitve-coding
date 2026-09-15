import java.util.*;
class duplicate_floyd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        for(int i=0;i<n+1;i++){
            arr[i]=sc.nextInt();
        }
        int slow=arr[0];
        int fast=arr[0];
        do{
            slow=arr[slow];
            fast=arr[arr[fast]];
        } while(slow != fast);
        slow=arr[0];
        while(slow != fast){
            slow=arr[slow];
            fast=arr[fast];
        }
        int duplicate=slow;
        System.out.println("Repeated number: "+duplicate);
    }
}