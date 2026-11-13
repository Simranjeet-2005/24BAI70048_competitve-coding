import java.util.Scanner;
public class coin_change_brute {
    static int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        int minCoins = Integer.MAX_VALUE;
        for (int coin : coins) {
            if (amount >= coin) {
                int result = coinChange(coins, amount - coin);
                if (result != Integer.MAX_VALUE) {
                    minCoins = Math.min(minCoins, result + 1);
                }
            }
        }
        return minCoins;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of coin denominations: ");
        int n = sc.nextInt();
        int[] coins = new int[n];
        System.out.println("Enter coin denominations:");
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        System.out.print("Enter amount: ");
        int amount = sc.nextInt();
        int ans = coinChange(coins, amount);
        if (ans == Integer.MAX_VALUE) {
            System.out.println("Minimum coins: -1");
        } else {
            System.out.println("Minimum coins: " + ans);
        }
    }
}
