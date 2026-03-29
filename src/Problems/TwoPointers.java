package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoPointers {
    
    public boolean checkIfExist(int[] arr) {
        for(int i = 0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == 2*arr[j] || arr[j] == 2*arr[i])return true;
            }
        }
        return false;
    }

    //23.Move Zeros
    public void moveZeroes(int[] nums) {
        int pos = 0;

        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[pos];
                nums[pos] = temp;
                pos++;
            }
        }
    }

    //15. 3Sum
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++) {

            if(i > 0 && nums[i] == nums[i-1])
                continue;

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while(left < right && nums[left] == nums[left + 1])
                        left++;

                    while(left < right && nums[right] == nums[right - 1])
                        right--;

                    left++;
                    right--;
                }
                else if(sum < 0)
                    left++;
                else
                    right--;
            }
        }

        return result;
    }


}
