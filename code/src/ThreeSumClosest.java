import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by YuexingYin on 10/11/16.
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
