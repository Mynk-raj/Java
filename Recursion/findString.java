

public class findString {

    public static void find(String name, char search){
        int first = -1;
        int last = -1;

        for(int i = 0; i<name.length(); i++){
            if(search == name.charAt(i)){
                if(first == -1){
                    first = i;
                }else{
                    last = i;
                }
            }
        
        }

        System.out.println("First element find at index : " + first);
        System.out.println("Last element find at index : " + last);

    }


    public static void main(String[] args) {
        String name = "abcas";
        find(name, 'a');
        System.out.println();
        
    }
}
