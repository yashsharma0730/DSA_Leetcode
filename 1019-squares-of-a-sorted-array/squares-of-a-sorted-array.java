class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            int b = a * a ;
            nums[i]= b;
        }
        Arrays.sort(nums);
        return nums;
    }
}