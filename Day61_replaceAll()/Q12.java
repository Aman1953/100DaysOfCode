import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        str = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("Output : "+str);
    }
}



