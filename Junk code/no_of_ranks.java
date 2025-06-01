class no_of_ranks{
    public static void main(String args[]){
        System.out.print("Har Har Mahadev ");

        int ranks [] ={4, 3, 7, 2, 6, 1,0};

        int cuts = 0;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i<ranks.length-1; i++){
            if(smallest > ranks[i]){
                smallest = ranks[i];
                cuts++;
            }
        }

        System.out.println(cuts);
    }
}