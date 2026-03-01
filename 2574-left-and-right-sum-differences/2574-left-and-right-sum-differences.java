class Solution {
    public int[] leftRightDifference(int[] nums) {
        int a[]=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            a[i]=sum;
            sum=sum+nums[i];
        }
        int b[]=new int[nums.length];
        int sum1=0;
        for(int i=nums.length-1;i>=0;i--){
            b[i]=sum1;
            sum1=sum1+nums[i];
        }
        int f[]=new int[nums.length];
         for(int i=0;i<nums.length;i++){
            int v = Math.abs( a[i]-b[i]);
            f[i]=v;
            
        }
      return f;


        
    }
}