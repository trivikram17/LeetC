class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> c=new HashSet<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char v=s.charAt(i);
            c.add(v);
        }
        return c.size();
    }
}