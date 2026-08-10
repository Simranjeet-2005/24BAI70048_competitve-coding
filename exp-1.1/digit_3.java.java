import java.util.*;
class digit_3{
    public static HashSet<Integer> set;
    public static ArrayList<Integer> res;
    public static ArrayList<Integer> duplicate(int []arr,int k){
        int n=arr.length;
      for(int i=0;i<n;i++){
          if(set.contains(arr[i])){
              res.add(arr[i]);
              if(set.size()>k){
                  set.remove(arr[i-k]);
              }
          }
          set.add(arr[i]);
      }
      return res;
    }
    public static void main(String[] args){
        set=new HashSet<>();
        res=new ArrayList<>();
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
        System.out.print(duplicate(arr,k));
    }
}