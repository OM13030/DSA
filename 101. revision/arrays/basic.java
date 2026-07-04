public class basic{
    public static int linearSeartch(int nums[], int key){
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == key){
                return i;
                
            }
        }
        return -1;
    }

    public static int binarySearch(int nums[], int key){
        int low = 0;
        int high = nums.length-1;
        while(low < high){
            int mid = (low + high) / 2;
            if(nums[mid] == key){
                return mid;
            }
            else if(nums[mid] > key){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }

    public static void reverse(int nums[]){
        int low = 0;
        int high = nums.length-1;
        while(low < high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;

            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        reverse(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}