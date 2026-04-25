public class lastoccurance{

    public static int lastoccurance(int arr[] , int key , int i){

        if(i == arr.length){
            return -1;
        }
        int isfound = lastoccurance(arr, key, i+1);

        if(isfound == -1 && arr[i] == key){
            return i;
        }
        return isfound;
    }      
    public static void main(String[] args) {
        int arr[] = {3,2,1,7,6,5,3,4,3,2,1};
        System.out.println(lastoccurance(arr, 1, 0));
    }
}