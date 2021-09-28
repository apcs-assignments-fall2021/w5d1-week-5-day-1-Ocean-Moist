import java.util.Arrays;

public class MyMain {
    // Sorting:
    // Implement the selection sort algorithm that we discussed in class
    // to sort our code
    // This algorithm returns the sorted array
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }
        return arr;
    }

    // Implement the insertion sort algorithm that we discussed in class
    // to sort our code
    // This algorithm returns the sorted array
    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Selection Sort Tests");
        System.out.println(Arrays.toString(selectionSort(new int[] {6, 1, 3, 8, 2, 9}))); // [1, 2, 3, 6, 8, 9]
        System.out.println(Arrays.toString(selectionSort(new int[] {12, 5, 23, 74, 15, 86, 2}))); // [2, 5, 12, 15, 23, 74, 86]

        System.out.println("Selection Sort Tests");
        System.out.println(Arrays.toString(selectionSort(new int[] {6, 1, 3, 8, 2, 9}))); // [1, 2, 3, 6, 8, 9]
        System.out.println(Arrays.toString(selectionSort(new int[] {12, 5, 23, 74, 15, 86, 2}))); // [2, 5, 12, 15, 23, 74, 86]
    }
}