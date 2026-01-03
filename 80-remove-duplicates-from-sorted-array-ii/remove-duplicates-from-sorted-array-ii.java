class Solution {
    public int removeDuplicates(int[] nums) {
        int n =nums.length;
        if(n<=2) return n;
        int off =1;
        int cm =2;
        while(cm<n){
            if(nums[cm]!=nums[off]|| nums[cm]!=nums[off-1]){
                off++;
                nums[off]=nums[cm];
            }
            cm++;
        }
        return off+1;
    }
}