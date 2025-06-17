public class revString {

    public static void rev(String name, int index){

        if(index == 0){
            System.out.print(name.charAt(index));
            return;
        }
        
       System.out.print(name.charAt(index));
       rev(name, index-1);

    }

    public static void main(String[] args) {
        String name = "mayank";
        rev(name, name.length()-1);
    }
}
