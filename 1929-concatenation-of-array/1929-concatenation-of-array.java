class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
       int  arr[]=new int[nums.length+nums.length];
       for(int i=0;i<n;i++){
            arr[i]=nums[i];
       }
       for(int i=0;i<n;i++){
            arr[nums.length+i]=nums[i];
       }
       

       return arr;
        
    }
}