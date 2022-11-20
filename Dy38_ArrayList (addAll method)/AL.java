// Joining two ArrayLists in Java
import java.util.ArrayList;
public class AL {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        for (Integer i: l1) {
            System.out.print(i+" ");
        }
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);
        l2.add(15);
        l1.addAll(l2);
        System.out.println();
        for (Integer i : l1) {
            System.out.print(i+" ");
        }
    }
}




