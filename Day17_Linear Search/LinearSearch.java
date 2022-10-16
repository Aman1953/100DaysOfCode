public class LinearSearch {
    public static int linearSearch(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {-8,34,2,5,6,1,35};
        int x = 1;
        int result = linearSearch(array, x);
        if (result == -1)
            System.out.print("Element not found");
        else
            System.out.print(x+" is found at index " + result);
    }
}