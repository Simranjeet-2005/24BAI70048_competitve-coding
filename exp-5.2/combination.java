import java.util.*;

class combination {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<Integer> list = new ArrayList<>();
        Set<List<Integer>> comb = new HashSet<>();

        comb = ps(candidates, target, 0, list, comb);

        List<List<Integer>> ans = new ArrayList<>(comb);

        return ans;
    }

    public static Set<List<Integer>> ps(int[] candidates, int target,
                                        int i, List<Integer> list,
                                        Set<List<Integer>> comb) {

        if (target == 0) {
            comb.add(new ArrayList<Integer>(list));
            return comb;
        }

        if (i == candidates.length || target < 0) {
            return comb;
        }

        // Take the current element
        list.add(candidates[i]);

        // Take it and move to next index
        ps(candidates, target - candidates[i], i + 1, list, comb);

        // Take it again (repetition allowed)
        ps(candidates, target - candidates[i], i, list, comb);

        // Backtrack
        list.remove(list.size() - 1);

        // Skip the current element
        ps(candidates, target, i + 1, list, comb);

        return comb;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of candidates: ");
        int n = sc.nextInt();

        int[] candidates = new int[n];

        // Input array
        System.out.println("Enter candidates:");
        for (int i = 0; i < n; i++) {
            candidates[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        // Create Solution object
        combination obj = new combination();

        // Get result
        List<List<Integer>> ans = obj.combinationSum(candidates, target);

        // Print result
        System.out.println("Combinations: " + ans);

        sc.close();
    }
}