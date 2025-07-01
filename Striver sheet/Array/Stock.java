// package Array;

public class Stock {

    public static void main(String[] args) {

        // int small = arr[0];
        // for(int k : arr){
        // if(k < small){
        // small = k;
        // }
        // }

        int arr[] = { 10, 7, 5, 8, 11, 9 };

        int buy = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[buy]) {
                buy = i;
            }
        }

        int sell = buy;
        for (int i = buy; i < arr.length; i++) {
            if (arr[i] > arr[sell]) {
                sell = i;
            }
        }

        System.out.println("Buying price of stock : " + arr[buy]);
        System.out.println("Selling pirce of stock : " + arr[sell]);

        if(arr[sell] == arr[buy]){
            System.out.println(0);
        }else{
            System.out.println("Total profit will be : " + (arr[sell] - arr[buy]));
        }

        // int high = 0;
        // for(int i = 0; i<arr.length; i++){
        //     if(arr[i] > arr[high]){
        //         high = i;
        //     }
        // }

        // System.out.println(buy);
        // System.out.println(arr[high]);
        // System.out.println(sell);

    }
}
