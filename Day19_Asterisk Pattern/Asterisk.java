import java.util.Scanner;

public class Asterisk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows or columns : ");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j <=n ; j++) {
                if (i == n/2+1 || j == n/2+1 || i==j || i+j == n+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}





