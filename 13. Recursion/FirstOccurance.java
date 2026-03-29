public class FirstOccurance{

    public static int FirstOccurance(int arr[], int key , int i){
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == key ){
            return i;
        }
        return FirstOccurance(arr, key, i+1);
    }

     public static void main(String[] args) {
         int arr[] = {1,2,3,4,5,3,4,76,3,4};
         System.out.println(FirstOccurance(arr, 4,0 ));
     }
}