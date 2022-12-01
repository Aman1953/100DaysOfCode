import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        int no_of_times = sc.nextInt();
        for (int i = 0; i < no_of_times ; i++) {
            String str = sc.next();
            if(str.equals("Insert"))
            {
                int index = sc.nextInt();
                int element = sc.nextInt();
                arr.add(index,element);
            }
            if(str.equals("Delete"))
            {
                int index = sc.nextInt();
                arr.remove(index);
            }
        
        }
        for (Integer integer : arr) {
            System.out.print(integer+" ");
        }
        
    }
}