class Solution {
    public int minElement(int[] nums) {
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int sum=0;
            while(nums[i]!=0){
                int rev=nums[i]%10;
                sum =sum+rev;
                nums[i]=nums[i]/10;
            }
            a[i] = sum;
        }
        Arrays.sort(a);
        return a[0];
        
    }
}