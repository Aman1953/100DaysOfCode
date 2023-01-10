import java.util.*;
public class Q7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int u = sc.nextInt();
        int x = sc.nextInt();
        System.out.print("The number of occurrences of digit " +x+" lying in the range [ "+l+" "+u+" ] = ");
        System.out.print(countDigitOccurrences(l,u,x));
    }
    static int countDigitOccurrences(int l, int u, int x)
    {
        int rem, count = 0;
        for(int i = l; i<=u; i++)
        {
            int temp = i;
            while(temp!=0)
            {
                if(temp%10 == x)
                    count++;
                temp = temp/10;
            }
        }
        return count;
    }
}




