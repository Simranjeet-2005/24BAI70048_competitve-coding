import java.util.Scanner;
class stairs_brute {
    static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of stairs: ");
        int n = sc.nextInt();
        int result = climbStairs(n);
        System.out.println("Number of ways: " + result);
        }
}
