package Sorting.Basic;
// package Sorting;

public class bubble {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 8, 1, 4, 3, 7, 10, 9 };

        
for(int i = 0; i < arr.length; i++) {
    boolean swapped = false;
    for(int x = 0; x < arr.length - 1 - i; x++) {
        if(arr[x] > arr[x+1]) {
            int temp = arr[x];
            arr[x] = arr[x+1];
            arr[x+1] = temp;
            swapped = true;
        }
    }
    if(!swapped) break; // Array is already sorted
}


        //Printing 
        for(int k : arr){
            System.out.print(k + " ");
        }

    }
}
