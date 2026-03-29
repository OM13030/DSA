public class subarrays{
    public static void printsubarrays(int numbers[]){
        int ts = 0;
        for(int i =0;i<numbers.length;i++){
            int start = i;
            for(int j = i;j<numbers.length;j++){
                int end = j;
                for(int k = start; k<=end; k++){
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        } 
        System.out.println("total number of pairs = " + ts);

    }
    public static void main(String[] args) {
        int numbers[] = {12,23,34,45,56};
        printsubarrays(numbers);
        
    }
}

//  total pairs = n(n+1)/2;
//  