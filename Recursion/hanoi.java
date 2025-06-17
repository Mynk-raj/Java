public class hanoi {

    public static void towerOfHanoi(int num, String src, String helper, String destiny){

        if(num == 1){
             System.out.println("transfer disk : "+num+" from " + src + " to " + destiny );
             return;
        }

        towerOfHanoi(num-1, src, destiny, helper);
        System.out.println("transfer disk : "+num+" from " + src + " to " + destiny );
        towerOfHanoi(num-1, helper, src, destiny);

    }

    public static void main(String[] args) {
        int num = 5;
        towerOfHanoi(num, "S", "H", "D");
    }
}
