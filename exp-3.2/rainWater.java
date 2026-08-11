import java.util.*;
public class rainWater {
    public static int trap(int[] height) {
        int n=height.length;
        int sum=0;
        int lmax=0;
        int rmax=0;
        int l=0;
        int r=n-1;
        while(l<r){
            lmax=Math.max(lmax, height[l]);
            rmax=Math.max(rmax, height[r]);
            if(lmax<rmax){
                sum+=lmax-height[l];
                l++;
            }else{
                sum+=rmax-height[r];
                r--;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of bars:");
        int n=sc.nextInt();
        int[] height=new int[n];
        System.out.println("Enter heights:");
        for (int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }
        System.out.println("Trapped water: " + trap(height));
    }
}