
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-32,-12,6,8,65,98,102};
        int target = 65;
        int ans = binarySearch(arr, target);
        System.out.println(target+" is found at index number "+ans);
    }
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
