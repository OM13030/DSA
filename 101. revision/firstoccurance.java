public class firstoccurance{
    public static int firstoccurance(int arr[] , int key , int i){

        if(i == arr.length){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }

        return firstoccurance(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,5,6,7,4,5,6,7};
        int result = firstoccurance(arr, 4, 0);
        System.out.println(result);
    }
}