package Sorting;

public class selection {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 8, 1, 4, 3, 7, 10, 9 };

        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for(int x = i+1; x<arr.length; x++){
                if(arr[smallest] > arr[x]){
                    smallest = x;
                }
            }
            // swapping 
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }

          //Printing 
        for(int k : arr){
            System.out.print(k + " ");
        }

    }
}
