class Solution {
    public int mirrorDistance(int n) {
        int v=n;
        int rev=0;
        int a=0;
        while(n>0){
             a=n%10;
            rev=rev*10+a;
            n=n/10;

        }
        return Math.abs(v-rev);
         

        
    }
}