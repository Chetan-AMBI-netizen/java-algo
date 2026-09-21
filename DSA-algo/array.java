import java.util.Arrays;

public class array{
    public static void main(String[] args) {
        // Define an unsorted linear array
        int[] arr = {5, 2, 8, 1, 10};

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Display the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
