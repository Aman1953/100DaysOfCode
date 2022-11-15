class Sum{
    static int sum(int a, int b)
    {
        return a+b;
    }
}
class Avg extends Sum{
    static int avg(int a){
        return a/2;
    }
}
public class InstanceOfOperator {
    public static void main(String[] args) {
        Avg av = new Avg();
        boolean b = av instanceof Sum;
        System.out.println(b);
    }
}



