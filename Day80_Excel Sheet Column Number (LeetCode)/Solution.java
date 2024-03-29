class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0, p = 0;
        for(int i=columnTitle.length()-1; i>=0; i--){
         //   char c = columnTitle.charAt(i);
            int val = (int) columnTitle.charAt(i) - 65 + 1;
            ans += val * Math.pow(26,p);
            p++; 
        }
        return ans;
    }
}