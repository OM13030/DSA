public class evenodd{
    public static int countevenodd(int nums[]){
        int even = 0;
        int odd = 0;
        for (int i = 0 ; i < nums.length; i++) {
            if(nums[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        return odd;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,4,53};
        System.out.println(countevenodd(nums));

    }
}