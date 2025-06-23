import java.util.*;

public class anagramString {

    // public static boolean anagram(String arr[]) {

    //     // for any string which have un-even number 
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[0].length() != arr[i].length()) {
    //             return false;
    //         }
    //     }


    //     char count[] = new char[26];

    //     for(int i = 0; i<arr.length; i++){

    //         int m = arr[i].length();
    //         int n = arr[i+1].length();
    //         // for()

    //     }


    //     return true;
    // }

    public static boolean recurrAnagram(String s1, String s2){

        int m = s1.length();
        int n = s2.length();

        if(m != n) return false;

        int arr[] = new int[26];

        for(int i = 0; i<m; i++){
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i] != 0){
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        String arr[] = { "bat", "tab", "cat", "act", "tac" };

        String s1 = arr[0];
        String s2 = arr[1];

        System.out.println(recurrAnagram(s1,s2));
    }
}
