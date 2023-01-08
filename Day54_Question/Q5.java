import java.util.Scanner;
public class Q5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter credit card number: ");
        long cn = sc.nextLong();
        long temp = cn;
        long temp2 = cn;
        long doubleDigit = 0, last2Digit = 0, lastDigit = 0, sum1 = 0;
        while(cn>0) {
            last2Digit = cn % 100;
            lastDigit = last2Digit / 10;
            doubleDigit = lastDigit * 2;
            if(doubleDigit>9) {
                long inner_first = doubleDigit % 10;
                long inner_second = doubleDigit / 10;
                doubleDigit = inner_first + inner_second; }
            sum1 = sum1 + doubleDigit;
            cn/=100; }
        long odd_digit = 0, sum2 = 0;
        while(temp>0) {
            odd_digit = temp % 10;
            temp = temp / 100;
            sum2 += odd_digit; }
        long finalSum = sum1 + sum2;
        if(finalSum % 10 == 0)
            System.out.println(temp2+" is valid");
        else
            System.out.print(temp2+" is invalid");
    }
}


