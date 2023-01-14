import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        String b = Integer.toBinaryString(n);
        char [] ch = b.toCharArray();
        int ctr = 0;
        for (int i = 0; i < b.length(); i++) {
            if (ch[i] == '1')
                ctr++;}
        System.out.println("Number of 1s is : "+ctr);
    }
}




