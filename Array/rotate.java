// package Array;

public class rotate {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }



        // Printing array using for each loop 
        for (int k : arr) {
            System.out.print(k + " ");
        }


        // Bubble sort 

        for(int i = 0; i<arr.length; i++){
            for(int x = 0; x<arr.length-i-1; x++){
                if(arr[x] > arr[x+1]){
                    int temp = arr[x];
                    arr[x] = arr[x+1];
                    arr[x+1] = temp;
                }
            }
        }

        System.out.println(); 
        // Printing array using for each loop 
        for (int k : arr) {
            System.out.print(k + " ");
        }



        
        
        // searching using Binary search in array 
        
            int search = 20;
            int initial = 0;
            int destiny = arr.length-1;

            while (initial < destiny) {
                int mid = (initial + destiny) / 2;

                if(arr[mid] == search){
                    System.out.println("\nElement is found at index : " + mid);
                    break;
                }else if(search > arr[mid]){
                    initial = mid + 1;
                }else if( search < arr[mid]){
                    destiny = mid -1;
                }
            }
    }
}
