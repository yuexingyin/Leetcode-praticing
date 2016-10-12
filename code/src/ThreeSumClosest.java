import java.util.Arrays;

/**
 * The basic idea is as follows:

 Basically we need to minimize the absolute value of (target – (A[i] + A[j] + A[k]).
 We follow exactly the same procedure as in 3sum problem by first sorting the whole array and linear scan the rest of the array to find two sum.

 If the sum of the triplet is greater than the target, it is obvious that we need to reduce the sum, so set k = k – 1.
 Similarly if sum of the triplet is less than the target, then we set j = j + 1,
 at the same time if we got a sum closer to the target, we keep record of it.

 (copyright @sigmainfy)
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE;
        int res = 0;
        Arrays.sort(nums);
        for(int i =0;i<nums.length;i++){
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int threeSum = nums[i]+nums[left]+nums[right];
                int tmpDiff = target-threeSum;
                if(tmpDiff == 0){
                    return target;
                }
                if(Math.abs(tmpDiff)<diff){
                    diff = Math.abs(tmpDiff);
                    res = threeSum;
                }
                if(tmpDiff>0){
                    left++;
                }else {
                    right--;
                }
            }
        }
        return res;
    }
}
