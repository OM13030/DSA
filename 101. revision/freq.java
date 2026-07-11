
import java.util.Arrays;

public class freq{
    public static int highestfreq(int[] nums){
        Arrays.sort(nums);
        int maxfreq = 1;
        int currfreq = 1;
        int ans = nums[0];
        boolean duplicate = false;
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                currfreq++;
            }else{
                if(currfreq > maxfreq){
                    maxfreq = currfreq;
                    ans = nums[i-1];
                    duplicate = false;
                }else if(currfreq == maxfreq){
                    duplicate = true;
                }
                currfreq = 1;
            }
        }

        //check last group
        if(currfreq > maxfreq){
            maxfreq = currfreq;
            ans = nums[nums.length-1];
            duplicate = false;
        }else if (currfreq == maxfreq && nums[nums.length-1] != ans){
            duplicate  =true;
        }
        return duplicate ? -1 : ans;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,4,3,6,5,4,3,2,3,5,2,3,4,5,6,4,3,2};
        System.out.println(highestfreq(nums));
    }
}