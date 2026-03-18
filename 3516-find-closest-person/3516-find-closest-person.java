class Solution {
    public int findClosest(int x, int y, int z) {
        int m=Math.abs(z-y);
        int n=Math.abs(z-x);
        if(m<n){
            return 2;
        }else if(n<m){
            return 1;
        }else{
            return 0;
        }
        
    }
}