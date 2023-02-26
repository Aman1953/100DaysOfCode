class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() == 0)
        return true;
        int ctr = 0;
        int length = word.length();
        for(int i=0; i<length; i++){
            int ch = word.charAt(i);
            if(ch>=65 && ch<=90)
            ctr++;
        } 
        if(ctr == word.length())
        return true;
        else if(ctr == 0)
        return true;
        else if(ctr==1 && word.charAt(0)>=65 && word.charAt(0)<=90)
        return true;
        else
        return false;
    }
}