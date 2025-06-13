// package Searching;

public class search {
    public static void main(String[] args) {
        // There are mainly two types of searching algo : Linear and binary search
        // Note : (for binary search elment are have sorted )

        int arr[] = { 2, 5, 8, 1, 4, 3, 7, 10, 9 };
        int search = 7;
        // Linear search : work on sorted or unsorted elment both : time and space
        // complentiy is : O(n), O(1)

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("Element " + search + " is found at index : " + i);
                found = true;
                break;
            } 
        }
        
        if(!found)
        System.out.println("element is not found !");




        // bubble sorting for making arry suitable for binary search
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Binary search
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == search) {
                System.out.println("Element " + search + " is found at index : " + mid);
                break;
            } else if (arr[mid] < search) {
                start = mid + 1;
            } else if (arr[mid] > search) {
                end = mid - 1;
            }
        }

    }
}
