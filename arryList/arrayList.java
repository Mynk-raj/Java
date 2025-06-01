import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {

        // implementation of array List

        ArrayList<Integer> list = new ArrayList();

        // adding element in arraylist
        list.add(4);
        list.add(5);
        System.out.println(list);

        // get or viewing arrylist
        int data = list.get(1);
        System.out.println(data);

        // adding element in random location
        list.add(0, 10);
        list.add(1, 11);
        System.out.println(list);

        // set function : changing value of existing element
        list.set(1, 22);
        System.out.println(list);

        // remove funtionn : it is used for deleting or remeoving element from list
        list.remove(1);
        System.out.println(list);

        // size funtion : we can find or count size of array
        System.out.println("size of arryList : " + list.size());

        // displaying different elementt in arrayList
        for (int i = 0; i < list.size(); i++) {     // first approach
            System.out.println(list.get(i));
        }

        for(int i : list){              // second approch for each loop
            System.out.println(i);
        }

        // sorting 
        Collections.sort(list);
        System.out.println(list);


        ArrayList<String> value = new ArrayList<>();

        value.add("Mayank");
        value.add(" ");
        value.add("Kumar !");
        System.out.println(value);

    }
}
