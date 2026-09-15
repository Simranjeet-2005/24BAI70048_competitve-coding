import java.util.*;
class duplicate_brute{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        for(int i=0;i<n+1;i++){
            arr[i]=sc.nextInt();
        }
        int duplicate = -1;
        for(int i=0;i<n+1;i++){
            for(int j=i+1;j<n+1;j++){
                if(arr[i]==arr[j]){
                    duplicate=arr[i];
                    break;
                }
            }
            if(duplicate!=-1){
                break;
            }
        }
        System.out.println("Repeated number: " +duplicate);
    }
}