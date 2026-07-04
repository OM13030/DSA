public class subarrays{

    public static void MaxSumSubArrayOptimized(int nums[]){
        //int ts = 0;
        int currSum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int [nums.length];

        prefix[0] = nums[0];
        // calculate prefix array
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            int start = 0;
            for(int j = i; j < nums.length; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] :  prefix[end] - prefix[start-1];

                if(maxsum < currSum){
                    maxsum = currSum;
                }
            }
        }
        System.out.println("max sum : " + maxsum);
    }
    


    public static void MaxSumSubArray(int nums[]){
        //int ts = 0;
        int currSum = 0;
        int maxsum = Integer.MIN_VALUE;


        for(int i = 0; i < nums.length; i++){
            int start = 0;
            for(int j = i; j < nums.length; j++){
                int end = j;
                currSum = 0;
                for(int k = start; k <= end; k++){
                    currSum += nums[k];
                }
                //ts++;
                System.out.print("currsum : " + currSum + " , ");
                if(maxsum < currSum){
                    maxsum = currSum;
                }
            }
            
        }
        //System.out.println("total sub arrays are : " + ts);
        System.out.println( "\n\n"+"max sum : " + maxsum);
    }


    public static void printSubArrays(int nums[]){
        int ts = 0;
        for(int i = 0; i < nums.length; i++){
            int start = 0;
            for(int j = i; j < nums.length; j++){
                int end = j;
                for(int k = start; k <= end; k++){
                    System.out.print(nums[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub arrays are : " + ts);
    }
    public static void main(String[] args) {
        int nums[] = {2,-1,6,-3,10};
        MaxSumSubArrayOptimized(nums);
    }
}