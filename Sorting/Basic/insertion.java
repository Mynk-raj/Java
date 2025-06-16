// package Sorting.Basic;

public class insertion {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 8, 1, 4, 3, 7, 10, 9 };
        for (int k : arr)
            System.out.print(k + " ");

        // Insertion sort
        for (int i = 1; i < arr.length; i++) {
            int j = i;

            while (j > 0 && arr[j] < arr[j - 1]) {
                // swap
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j-1] = temp;
                j--;
            }
        }

        // printing
        System.out.println("\nsorted array : ");
        for (int k : arr)
            System.out.print(k + " ");

    }
}
