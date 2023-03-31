class Solution {
    public int lengthOfLongestSubstring(String s) {
        int first_pointer = 0;
        int second_pointer = 0;
        int max = 0;
        HashSet<Character> set = new HashSet();
        while(second_pointer<s.length()){
            if(!set.contains(s.charAt(second_pointer))){
                set.add(s.charAt(second_pointer));
                max = Math.max(set.size(),max);
                second_pointer++;
            }else{
                set.remove(s.charAt(first_pointer));
                first_pointer++;
            }
        }
        return max;
    }
}