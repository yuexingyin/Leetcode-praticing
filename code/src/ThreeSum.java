import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by YuexingYin on 10/11/16.
 */
public class ThreeSum {
    /*The basic idea is: a+b+c = 0, so a+b = -a; And we also need to avoid duplicate triplets. The steps are following:
 1. Sort the whole input array by increasing order: O(NlogN)
 2. Linear scan the sorted array, say the current element to process is A[i],
 check if A[i] is the same with the previous one,only when they are different we go the next steps.
 3. Treat A[i] as the first value in the potential triplet,
 and solve a two sum problem in the rest of the input starting from i+1 with the target as -A[i],
 similar trick as in step 2 should be performed to avoid repeated triplets.

*/


    public class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> res = new ArrayList<List<Integer>>();
            if(nums == null || nums.length<3){
                return res;
            }
            Arrays.sort(nums);//sort the array
            for(int i=0; i<nums.length; i++){
                if(i==0 || nums[i]>nums[i-1]){//avoid duplicate triplets
                    int target = (-nums[i]);//a+b = -c
                    int left = i+1;
                    int right = nums.length-1;
                    while(left<right){
                        if(nums[left]+nums[right]<target){
                            left++;
                        }else if(nums[left]+nums[right]>target){
                            right--;
                        }else{
                            List<Integer> tmp = new ArrayList<Integer>();
                            tmp.add(nums[i]);
                            tmp.add(nums[left]);
                            tmp.add(nums[right]);
                            res.add(tmp);
                            left++;
                            right--;
                            while(left < right && nums[left] == nums[left-1]){//avoid duplicate triplets
                                left++;
                            }
                            while(left < right && nums[right] == nums[right+1]){//avoid duplicate triplets
                                right--;
                            }
                        }

                    }
                }
            }
            return res;
        }
    }
}
