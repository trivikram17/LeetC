class Solution {
    public int subarraySum(int[] nums) {
        int n=nums.length;
        int t=0;
        for(int i=0;i<n;i++){
            int s=Math.max(0,i-nums[i]);
            int sum=0;
            for(int j=s;j<=i;j++){
                sum+=nums[j];
            }
            t=t+sum;
        }
        return t;
    }
}