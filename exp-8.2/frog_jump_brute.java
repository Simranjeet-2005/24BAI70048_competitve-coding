import java.util.Scanner;
class frog_jump_brute {
    static int frogJump(int index, int k, int[] height) {
        if (index == 0) {
            return 0;
        }
        int minEnergy = Integer.MAX_VALUE;
        for (int j = 1; j <= k; j++) {
            if (index - j >= 0) {
                int energy = frogJump(index - j, k, height)+ Math.abs(height[index] - height[index - j]);
                minEnergy = Math.min(minEnergy, energy);
            }
        }
        return minEnergy;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of stairs: ");
        int n = sc.nextInt();
        System.out.print("Enter maximum jump distance k: ");
        int k = sc.nextInt();
        int[] height = new int[n];
        System.out.println("Enter heights:");
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        System.out.println("Minimum energy: "+frogJump(n - 1, k, height));
    }
}
