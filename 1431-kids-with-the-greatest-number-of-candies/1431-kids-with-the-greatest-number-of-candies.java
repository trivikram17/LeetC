class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        List<Boolean>g=new ArrayList<>();
        int max=candies[0];
        for(int i=0;i<n;i++){
            if(candies[i]>max){
                max=candies[i];
            }

        }
        for(int i=0;i<n;i++){

                if(candies[i]+ extraCandies >= max){
                    g.add(true);

                }else{
                    g.add(false);
                }
            
            
        }
        return g;
        
    }
}