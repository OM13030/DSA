public class missingnum{
    public static int missingnum(int nums[]){
        int expectsum = 0;
        for(int i = 0; i<=nums.length; i++){
            expectsum += i;
        }
        int actsum = 0;
        for(int i = 0; i<nums.length;i++){
            actsum += nums[i];
        }
        int ans = expectsum - actsum;
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {3,0,1}; 
        System.out.println(missingnum(nums));
    }
}