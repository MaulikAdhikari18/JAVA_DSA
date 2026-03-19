package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Backtracking {
    
    //Permutations 2
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        boolean[] used = new boolean[nums.length];

        backtrack(nums, used, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int[] nums, boolean[] used,List<Integer> temp,List<List<Integer>> result) {

        if(temp.size() == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i = 0; i < nums.length; i++){

            if(used[i])
                continue;

            if(i > 0 && nums[i] == nums[i-1] && !used[i-1])
                continue;

            used[i] = true;
            temp.add(nums[i]);

            backtrack(nums, used, temp, result);

            temp.remove(temp.size()-1);
            used[i] = false;
        }
    }

    //46.Permutation
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        backtrackp1(nums,used,new ArrayList<>(),result);
        return result;
    }

    private void backtrackp1(int[] nums,boolean[] used,List<Integer> temp,List<List<Integer>> result){
        if(temp.size() == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i = 0;i < nums.length;i++){

            if(used[i])continue;

            used[i] = true;
            temp.add(nums[i]);

            backtrackp1(nums,used,temp,result);

            temp.remove(temp.size()-1);
            used[i] = false;
        }
    }

    //39. Combination Sum
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack39(candidates,target,0,new ArrayList<>(),result);
        return result;
    }

    public void backtrack39(int[] candidates,int remain,int start,List<Integer> path,       List<List<Integer>> result){
        if(remain == 0){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i = start;i < candidates.length;i++){
            if(candidates[i] > remain)break;
            path.add(candidates[i]);
            backtrack39(candidates,remain-candidates[i],i,path,result);
            path.remove(path.size()-1);
        }
    }
}
