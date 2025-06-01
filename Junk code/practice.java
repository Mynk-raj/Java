import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 7, 4, 6, 3, 1, 8, 9, 10 };

        // linear search
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                System.out.println("index is equal too : " + i);
                break;
            }
        }

        // sorting : bubble sort

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // printing
        for (int k : arr) {
            System.out.print(k + " ");
        }

        // binary search

        int find = 3;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (find == arr[mid]) {
                System.out.println("\n"+mid);
                return;
            } else if (find > arr[mid]) {
                start = mid + 1;
            } else if (find < arr[mid]) {
                end = mid - 1;
            }
        }

    }
}
 