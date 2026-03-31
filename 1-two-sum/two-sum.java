
import java.util.Hashtable;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer,Integer> table = new Hashtable<>();
        for(int i=0;i<nums.length;i++){
            int miss = target - nums[i];

            if(table.containsKey(miss)){
                return new int[] {table.get(miss),i};
            }
            table.put(nums[i],i);
        }
        return new int[]{};
    }
}