import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
// import java.uitl.Iteration;

public class hasing {
    public static void main(String[] args) {
        HashSet<Integer> map = new HashSet<>();

        map.add(2);
        map.add(4);
        map.add(5);
        map.add(12);

        map.remove(5);


        System.out.println(map);

        if(map.contains(2)){
            System.out.println("map has value ");
        }

        if(!map.contains(22)) System.out.println("map has doesnt 4");

        // if(map.next)
        // Iterator it = new Iterator();

        // if(map.it.hasNext()){
        //     System.out.println(it.next());
        // }

        int arr[]= {1,2,3};
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for(int k : arr){
            System.out.println(k);
        }

    }
}
