import java.util.*;
public class subset_backtracking {
    public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        ps(nums, ans, list, 0);
        return ans;
    }
    public static List<List<Integer>> ps(
            int[] nums,
            List<List<Integer>> ans,
            List<Integer> list,
            int i) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(list));
            return ans;
        }
        list.add(nums[i]);
        ps(nums, ans, list, i + 1);
        list.remove(list.size() - 1);
        ps(nums, ans, list, i + 1);
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {3,5,7,2};
        List<List<Integer>> ans = subsets(nums);
        System.out.println(ans);
    }
}