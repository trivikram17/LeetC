class Solution {
    public String defangIPaddr(String address) {
        int l=address.length();
        String ans = "";
        for(int i=0;i<l;i++){
            if(address.charAt(i)=='.'){
                ans = ans + "[.]";
            }
            else
            {
                ans = ans+address.charAt(i);
            }
        }
        return ans;
    }
}