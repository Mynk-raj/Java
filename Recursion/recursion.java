// package Recursion;

public class recursion {

    public static void table(int num) {

        if (num == 20) {
            System.out.println(num);
            return;
        }

        System.out.println(num);
        table(num + 2);

    }

    public static int power(int num) {
        if (num == 1)
            return 0;

        int pow = 0;
        pow += 2 * num;
        power(num - 1);

        return pow;
    }

    public static int fun(int arr[]) {

        int slow = 0;
        int fast = 0;
        int mid = 0;

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr.length - 1 - i; j++) {
        // if (arr[j] > arr[j + 1]) {
        // int temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;
        // }
        // }
        // }

        // for(int i = 0; i<arr.length; i++){
        // if(fast == arr.length-1 || fast == arr.length -2){
        // return slow;
        // }else{
        // slow++;
        // fast += 2;
        // }
        // }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i+1]) {
                largest = arr[i];
                second = arr[i+1];
                if(largest == second){
                    
                }
            }
        }

        return second;

    }

    public static void main(String[] args) {
        // table(2);
        // System.out.println(power(5));
        // int arr[] = { 4, 2, 6, 1, 3, 5, };


        int arr[] = { 4, 2, 6, 4, 3, 5, 2 };
        int k = 2;
        // int count = 0;
        // for(int i = 0 ; i<arr.length; i++){
        //     if(arr[i] == k){
        //         arr[i] = 0;
        //         count++;
        //     }else{
        //         continue;
        //     }
        // }

        int val[] = new int[2];

        for(int i = 0; i<arr.length ; i++){
            if(arr[i] == 2){
                val[0] = i;
                
            }
         
        }


        for (int i : val) {
            System.out.println(i);
        }

        // System.out.println(count);

    }
}
