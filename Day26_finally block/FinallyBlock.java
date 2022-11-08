public class FinallyBlock {
    public static int divide()
    {
        try {
            int a = 10;
            int b = 2;
            int c = a/b;
            return c;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("This is finally block");
       }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(divide());
    }
}
