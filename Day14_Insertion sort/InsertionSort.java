import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,3,4,2,1};
        System.out.println("\nBefore Insertion sort\n"+Arrays.toString(arr));
        for (int i = 0; i <= arr.length-2; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else break;
            }
        }
        System.out.println("\nAfter Insertion sort\n"+Arrays.toString(arr));
    }
}
