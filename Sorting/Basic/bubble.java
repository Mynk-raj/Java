package Sorting.Basic;
// package Sorting;

public class bubble {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 8, 1, 4, 3, 7, 10, 9 };

        for(int i = 0; i<arr.length; i++){
            for(int x = 0; x<arr.length-1-x; x++){
                if(arr[x] > arr[x+1]){
                    int temp = arr[x];
                    arr[x] = arr[x+1];
                    arr[x+1] = temp;
                }
            }
        }

        //Printing 
        for(int k : arr){
            System.out.print(k + " ");
        }

    }
}
