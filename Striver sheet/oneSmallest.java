

public class oneSmallest {

    int smallest(int arr[]){

        int small = arr[0];

        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] < small){
               small = arr[i]; 
            }
        }

        return small;
    }


    public static void main(String[] args) {
        int arr[] = {2,5,6,7,9,8,1,3};
        oneSmallest sh = new oneSmallest();

       
        System.out.println(sh.smallest(arr));
    }
}
