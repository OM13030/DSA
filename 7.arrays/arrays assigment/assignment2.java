// binary search
public class assignment2{
    public static int binarysearch(int arr[] , int key){
        int low = 0;
        int high = arr.length;
        while(low < high){
            int mid = (low + high)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] > key){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr [] = {2,4,6,8,9,10,34};
        int key = 8;
        System.out.println(binarysearch(arr, key));
        
    }
} 