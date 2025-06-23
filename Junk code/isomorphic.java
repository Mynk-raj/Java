public class isomorphic {
   
    public static boolean isomorphic(String s1, String s2){

        int m = s1.length();
        int n = s2.length();

        if(m != n){
            return false;
        }

        int arr[] = new int[26];


        return true;
    }
   
    public static void main(String[] args) {
        String s1 = "mayank";
        String s2 = "kumark";
        
        System.out.print(isomorphic(s1,s2));
    }
}
