// package Sorting.Intermediate;

public class merge {

    public static void conqur(int arr[], int start, int mid, int end) {

        int merge[] = new int[end - start + 1];
        int idx1 = start;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                merge[x] = arr[idx1];
                x++;
                idx1++;
            } else {
                merge[x] = arr[idx2];
                x++;
                idx2++;
            }
        }

        while (idx1 <= mid) {
            merge[x] = arr[idx1];
            x++;
            idx1++;
        }

        while (idx2 <= end) {
            merge[x] = arr[idx2];
            x++;
            idx2++;
        }

        for (int i = 0, j = start; i < merge.length; i++, j++) {
            arr[j] = merge[i];
        }

    }

    public static void divide(int arr[], int start, int end) {

        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);

        // conquer
        conqur(arr, start, mid, end);

    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 1, 7, 9, 4, 7 };

        divide(arr, 0, arr.length - 1);

        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
}
