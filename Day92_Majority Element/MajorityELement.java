package Competetive;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the values into the array: ");
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        int condition = arr.length/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int j : arr) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
        for (Map.Entry<Integer,Integer> e : map.entrySet()){
            if (e.getValue()>condition)
                System.out.println(e.getKey());
        }
    }
}

