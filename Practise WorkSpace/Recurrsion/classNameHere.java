import java.util.ArrayList;
import java.util.List;

public class classNameHere {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        callForSubsets(0, nums, subset, result);
        return result;
    }

    private void callForSubsets(int index, int[] nums, List<Integer> subset, List<List<Integer>> result) {
        result.add(new ArrayList<>(subset));

        for (int i = index; i < nums.length; i++) {
            subset.add(nums[i]);
            callForSubsets(i + 1, nums, subset, result);
            subset.remove(subset.size() - 1);
        }
    }

    public static void main(String[] args) {
        classNameHere solution = new classNameHere();
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = solution.subsets(nums);

        // Print the subsets
        for (List<Integer> subset : subsets) {
            System.out.print("[");
            for (int num : subset) {
                System.out.print(num + " ");
            }
            System.out.println("]");
        }
    }
}
