class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxcount=0;
        int count =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==1){
                count+=1;
            if(count > maxcount){
                maxcount=count;
            }
            }
            if(nums[i]==0){
                count=0;
            }
        }
        return maxcount;
    }
}