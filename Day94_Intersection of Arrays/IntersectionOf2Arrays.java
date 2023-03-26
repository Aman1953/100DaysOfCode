import java.util.HashSet;

public class IntersectionOf2Arrays {
    public static void main(String[] args) {
        int [] arr1 = {1,2,5,8,9};
        int [] arr2 = {3,4,5,6,8};
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();
        for (int k : arr1) {
            set.add(k);
        }
        for (int j : arr2) {
            if (set.contains(j)) {
                ans.add(j);
            }
        }
        System.out.println("Intersection : "+ans);
    }
}
