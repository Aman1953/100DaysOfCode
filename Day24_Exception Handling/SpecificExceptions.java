import java.util.Scanner;

public class SpecificExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = new int[3];
        marks[0]=34;
        marks[1]=45;
        marks[2]=38;
        try {
        System.out.println("Enter the index value of marks array which we want to divide");
        int index = sc.nextInt();
        System.out.println("Enter the value which will divide the array value");
        int no = sc.nextInt();
            int div = marks[index]/no;
            System.out.println("Division = "+div);
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException occurred");
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("IndexOutOfBoundsException occurred");
        }
        catch (Exception e)
        {
            System.out.println("Other Exception occurred");
            System.out.println("Reason : "+e);
        }
    }
}
