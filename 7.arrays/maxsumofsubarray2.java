public class maxsumofsubarray2{
    public static void maxsubarraysSum(int numbers[]){
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        //calculate prefix array
        for(int i = 1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i =0;i<numbers.length;i++){
            int start = i;
            for(int j = i;j<numbers.length;j++){
                int end = j;

                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                
                if(maxSum < currsum){
                    maxSum = currsum;
                }   
            }
        } 
        System.out.println(" max sum  = " + maxSum);

    }


// kandales algorithm is the best approach to solve max sub array
// karanke ema apde ek j loop use thy che etle O(n) tie complexity thse ane
// ema negative number ne consider karva karta apde zero ne consider karisu etle zero thi nana number ne consider j nai kariye em jo hoi to eni jagya e zero lai laisu. 


    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0;i<numbers.length;i++){
            cs = cs + numbers[i];
            if(cs < 0){        
                cs = 0;
            }
            if(ms < cs){
                ms = cs;
            }

        }
        System.out.println("our max sub array is " + ms);
    }
    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
        
    }
}