class Solution {
    public int reverse(int x) {
       long d = 0;
       int k = 0;
       if(x<0){
           k=1;
           x=x*(-1);
       }
       while(x>0){
           if(d*10+(x%10)>=Integer.MAX_VALUE)
           return 0;
           d=d*10+(x%10);
           x/=10;       
           }
    if(k==1)
    d=d*(-1);
    return (int)d;
}
}