import java.util.*;

public class anagramString {

    public static void anagram(String arr[]){
        Arrays.sort(arr);
        for(String k : arr){
            System.out.print(k + " ");
        }

        char index = 0;

        for(int i = 0; i<arr.length; i++){
           
        }

    }

    public static void main(String[] args) {
        String arr[] = {"bat", "tab", "cat", "act", "tac"};
        anagram(arr);
    }
}
