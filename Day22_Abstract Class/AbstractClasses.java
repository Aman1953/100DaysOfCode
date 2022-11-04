public class AbstractClasses {
    public static void main(String[] args) {
    Club c = new Club();
    c.print();
    c.drama();
    c.technical();
    }
}
abstract class CulturalFest {
    public abstract void drama();        // Method Declaration
    public abstract void technical();
    public void print()
    {
        System.out.println("Welcome to Cultural Fest");
    }
}
class Club extends CulturalFest{
    public void drama()
    {
        System.out.println("Welcome to Drama Club!");
    }
    public void technical()
    { System.out.println("Welcome to technical club!"); }
}