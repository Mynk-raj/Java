public class blank {
    public static void main(String[] args) {
        String name = "aba";
        String rev = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            rev += name.charAt(i);
        }

        System.out.println(name.equals(rev) ? "palindrome" : "not palindrome");

        // Armstrong number

        int num = 153;
        int count = 0;

        while (num != 0) {
            int digit = num % 10;
            count++;
            num /= 10;
        }
       int sum = 0;
       for(int i =0; i<count; i++){
        int digit = num % 10;
        sum = digit * count;
       }

       System.out.println(sum);


    }
}
