import java.util.*;
public class BubbleSort{
    public static void main(String[] args)
    {
        int[] arr = {98,5,-5,98,76,12};
        System.out.println("\nBefore Sorting : " + Arrays.toString(arr));
        for (int i = 0; i <arr.length -1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("\nAfter Sorting : " + Arrays.toString(arr));
    }
}

