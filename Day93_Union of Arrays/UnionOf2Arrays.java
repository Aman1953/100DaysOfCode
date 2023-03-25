import java.util.HashSet;

public class UnionOf2Arrays {
    public static void main(String[] args) {
        int [] arr1 = {1,2,5,8,9};
        int [] arr2 = {3,4,5,6,8};
        HashSet<Integer> set = new HashSet<>();
        for (int j : arr1) {
            set.add(j);
        }
        for (int j : arr2) {
            set.add(j);
        }
        System.out.println(set);
    }
}
