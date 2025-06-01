public class selectionSort {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 6, 9, 5, 7, 0 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        System.out.println("this is \"java\"");
        
        // Selection sort 
        for(int i = 0; i<arr.length; i++){
            
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
        }
        
    }
}
