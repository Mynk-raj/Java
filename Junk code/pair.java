public class pair {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 2, 1, 3, 2 };
        int[] newarr = new int[arr.length / 2];

        int pair = 0;
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for(int i = 0 ; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                count++;
            }
            if(count % 2 == 0){
                newarr[0] = arr[i];
            }
        }



        for(int i = 0; i<newarr.length; i++){
            System.out.println(newarr[i]);
        }
       


        System.out.println(count);
    }
}
