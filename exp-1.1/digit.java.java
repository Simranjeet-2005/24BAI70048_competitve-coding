import java.util.*;
public class digit {
    public static ArrayList<Integer> res;
    public static ArrayList<Integer> duplicate(int arr[],int k,ArrayList<Integer> res) {
        int n=arr.length;
        for(int i=0;i<n;i++) {
            int j = i + 1;
            while (j < n && j <= k + i) {
                if (arr[i] == arr[j]) {
                    res.add(arr[i]);
                }
                j++;
            }
        }
            return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter k ");
        int k=sc.nextInt();
        res=new ArrayList<>();

        System.out.println(duplicate(arr,k,res));
    }
}