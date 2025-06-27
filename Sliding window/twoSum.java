public class twoSum {
    public static void main(String[] args) {
         int arr[] = { 4, 5, 6, 9, 1, 5 };
         int k = 10;  // target 

         // using brute force approch

         for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length-1; j++){
                if(arr[i] + arr[j] == k){
                    int val[] ={i,j};
                    System.out.println(val[i] + " " +val[j]);
                    return;
                }
            }
         }

    }
}
