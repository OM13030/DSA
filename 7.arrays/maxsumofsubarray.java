public class maxsumofsubarray{
     public static void maxsubarraysSum(int numbers[]){
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i =0;i<numbers.length;i++){
            int start = i;
            for(int j = i;j<numbers.length;j++){
                int end = j;
                currsum = 0;
                for(int k = start; k<=end; k++){
                    //sub array sum
                    currsum += numbers[k];
                    //System.out.print(numbers[k] + " ");
                    System.out.print(currsum +" " + ",");
                }
                System.out.println();
                
                if(maxSum < currsum){
                    maxSum = currsum;
                }   
            }
        } 
        System.out.println(" max sum  = " + maxSum);

    }
    public static void main(String[] args) {
        int numbers[] = {1,2,5,4,6};
        maxsubarraysSum(numbers);
          
    }
}

// time complexity is n^3 bcoz 3 loop use thaya che ane etla mate aa bv j kharab method kevay
// prefix method sari che ana compare ma 