class Solution {
    public int maxSubArray(int[] arr) {
        int i = 0;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        while(i < arr.length){
            currSum = arr[i] + currSum;
            maxSum = Math.max(currSum,maxSum);

            if(currSum < 0){
                currSum = 0;
            }

            i++;
        }
        return maxSum;

    }
}