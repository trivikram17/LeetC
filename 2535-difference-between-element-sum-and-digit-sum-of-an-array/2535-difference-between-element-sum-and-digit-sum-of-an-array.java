class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int sum1=0;
        for(int i=0;i<nums.length;i++){
            int t=nums[i];
            while(t>0){
                int v=t%10;
                sum=sum+v;
                t=t/10;

            }
            

            sum1=sum1+nums[i];
        }
        return Math.abs(sum1-sum);
        
    }
}