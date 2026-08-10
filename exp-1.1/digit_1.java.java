import java.util.*;
class digit_1{
   public static HashMap<Integer,Integer> map;
    public static ArrayList<Integer> res;
   public static ArrayList<Integer> duplicate(int arr[],int k,HashMap<Integer,Integer> map){
       int n=arr.length;
       for (int i=0;i<n;i++){
           if(map.containsKey(arr[i])){
               int prev=map.get(arr[i]);
               if(i-prev <=k){
                   res.add(arr[i]);
               }
           }
           map.put(arr[i],i);
       }
       return res;
   }
    public static void main(String args[]){
        map=new HashMap<>();
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
        System.out.print(duplicate(arr,k,map));
    }
}