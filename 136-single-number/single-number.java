class Solution {
    public int singleNumber(int[] nums) {
        int target = 0;
        for(int num:nums){
            target ^= num;
        }
        return target;
    }
}