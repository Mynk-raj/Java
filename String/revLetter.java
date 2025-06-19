// package String;

public class revLetter {
    public static void main(String[] args) {
        String data = "this is mayank";
        String arr[] = data.split("\\s+"); // Note : \\s+ means one or more whitespace characters (space, tab, etc.) 

       for(String k : arr){
        System.out.println(k);
       }

       for(int i = arr.length-1; i>=0; i--){
        System.out.print(arr[i] + " ");
       }
    }
}
