public class strictlyIncreasing {

    public static boolean check(int arr[], int index) {

        if (index == arr.length - 1) {
            return true;
        }

        // boolean result = true;
        // if (arr[index] < arr[index + 1]) {
        //     result = true;
        // } else {
        //     return false;
        // }
        // check(arr, index + 1);


        if(arr[index] < arr[index +1]){
           return check(arr, index+1);
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        // we have check whether our array is strictly increasing order or not !
        int arr[] = { 2, 3, 4, 5, 7, 8, 9 };
        int index = 0;
        System.out.println(check(arr, index));
    }
}
