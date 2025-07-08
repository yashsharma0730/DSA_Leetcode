class Solution {
    public int missingNumber(int[] nums) {
        int n =0;
        for(int i =0;i<nums.length;i++){
            n = n^nums[i]^(i+1);
        }
        return n;
    }
}