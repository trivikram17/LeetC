class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String v="";
        String w="";
        int n=word1.length;
        int m=word2.length;
        for(int i=0;i<n;i++){
            v=v.concat(word1[i]);
        }
        for(int i=0;i<m;i++){
            w=w.concat(word2[i]);
        }
        if(v.equals(w)){
            return true;
        }else{
            return false;
        }
        
    }
}