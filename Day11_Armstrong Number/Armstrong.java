import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0, ld;
        while (n>0){
            ld = n%10; // last digit
            sum = sum + (ld*ld*ld);
            n /= 10;
        }
        if (temp == sum)
            System.out.println(temp + " is an Armstrong number");
        else
            System.out.println(temp + " is not an Armstrong number");
    }
}
