class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int currsum=0;
        int sum=0;
        int chunks=0;
        for(int i=0;i<n;i++){
            currsum +=arr[i];
            sum += i;
            if(currsum==sum){
                chunks++;
            }
        }
        return chunks;
    }
}