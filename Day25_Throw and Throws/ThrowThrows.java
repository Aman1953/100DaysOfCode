import java.util.Scanner;

class NegativeRadius extends Exception {
    @Override
    public String toString() {
        return "Radius must be given +ve"; }
}
public class ThrowThrows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        int radius = sc.nextInt();
        try {
            System.out.println("Area of the circle = "+area(radius));
        }
        catch (Exception e) {
            System.out.println("Exception!\n"+e);
        }
    }
    public static double area(int n) throws NegativeRadius {
        if (n<0) {
            throw new NegativeRadius();
        }
        return Math.PI*n*n;
    }
}


