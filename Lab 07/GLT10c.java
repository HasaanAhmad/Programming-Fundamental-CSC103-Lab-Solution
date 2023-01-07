public class GLT10c {
    public static void main(String[] args) {
        int[] my_arr = { 1, 2, 4, 100, 300, 20, 56, 79 };
        int len = my_arr.length;
        int result = rec_bin_search(my_arr, 0, len, 300);
        if (result == -1)
            System.out.println("The element can't be found in the array");
        else
            System.out.println("The element has been found at index " + result);
    }

    public static int rec_bin_search(int my_arr[], int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (my_arr[mid] == x)
                return mid;
            if (my_arr[mid] > x)
                return rec_bin_search(my_arr, left, mid - 1, x);
            return rec_bin_search(my_arr, mid + 1, right, x);
        }
        return -1;
    }
}