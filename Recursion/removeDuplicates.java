public class removeDuplicates {
  
    public static boolean arr[] = new boolean[26];

    public static void remove(String name, int index, String newString){

        if(index == name.length()){
            System.out.println(newString);
            return;
        }

        char current = name.charAt(index);

        if(arr[current - 'a'] == true){
            remove(name, index+1, newString);
        }else{
            newString += current;
            arr[current - 'a'] = true;
            remove(name, index+1, newString);
        }


    }

  
  
    public static void main(String[] args) {
        String name = "axbxxcxxsx";
        remove(name, 0, "");
    }
}
