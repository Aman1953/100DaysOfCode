class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Math.pow(-2,31) && divisor==-1)
        {
        return (int)Math.pow(2,31);
        }
        return dividend/divisor;
    }
}