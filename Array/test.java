import java.util.*;

public class test {
    public static void main(String[] args) {
        int arr[] = {2,1,3,3};
        Arrays.sort(arr);
        for(int k : arr){
            System.out.println(k);
        }

        if(arr[0] == arr[1]){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
