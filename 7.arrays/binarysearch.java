public class binarysearch{
    public static int linearsearch( int numbers[] , int key){
        int low = 0;
        int high= numbers.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(numbers[mid] == key){
                return mid;
            }
            else if (numbers[mid] > key){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
            int numbers[] = {1,3,4,5,6,7,8,9,23,45,67,89};
            int key = 23;
            int index = linearsearch(numbers,key);
            System.out.println(index);

        }
}