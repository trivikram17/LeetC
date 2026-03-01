class Solution {
    public int subtractProductAndSum(int n) {
        
        int sum=0;
        int pro=1;
        while(n>0){
            int v=n%10;
            sum=sum+v;
            
             pro=pro*v;
            n=n/10;
           
        }
        return pro-sum;

        
    }
}