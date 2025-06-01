public class count {
 public static void main(String[] args) {
    int arr[] = {1,2,3,1,4,5};
    int k = 3; 
    
    int empty[] = new int[arr.length-2];


    for(int i = 0; i<arr.length-1; i++){

        for(int j = i ; j<3; j++){
            if(arr[j] > arr[j+1] || arr[j] > arr[j+2]){
                empty[j] = arr[j];
            }else if(arr[j+1] > arr[j+2]){
                empty[j] = arr[j+1];
            }else{
                empty[j] = arr[j+2];
            }
        }
    }


    // printing arry 

    for(int i = 0; i<empty.length; i++){
        System.out.print(empty[i] + " ");
    }

 }   
}
