class Solution {
    public String toLowerCase(String s) {
        String v ="";
        for(char ch : s.toCharArray()){
            ch =Character.toLowerCase(ch);
            v=v+ch;
            

        }
        return v;
        
    }
}