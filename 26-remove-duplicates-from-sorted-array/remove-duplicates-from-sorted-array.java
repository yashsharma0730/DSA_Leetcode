class Solution {
    public int removeDuplicates(int[] nums) {
        int l=nums.length;
        int off=0;
        int cm =1;
        int uniq=1;
        while(cm<l){
            if(nums[cm]==nums[cm-1]){
                cm++;
            }
            else{
                nums[off+1]=nums[cm];
                off++;
                uniq++;
                cm++;
        }
        }
        return uniq;
    }
}