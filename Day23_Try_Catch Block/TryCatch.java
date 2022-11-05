import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int no = sc.nextInt();
        try
        {
            no=50/0; // will throw exception
        }
        catch(Exception e) // exception handling
        {
            System.out.println("Number can't be divided with 0");
        }
    }
}

