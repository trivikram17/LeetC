class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count =0;
        for(int i=0;i<words.length;i++){
            String s=words[i];
            int f=1;
            for(int j=0;j<s.length();j++){
                if(allowed.indexOf(s.charAt(j))!=-1){
                    f=1;
                }else{
                    f=0;
                    break;
                }
            }
            if(f==1){
                count++;
            }
        }
        return count;
    }
}