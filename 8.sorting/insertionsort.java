public class insertionsort{
    public static void insertionsort(int arr[]){
        for (int i = 1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;

            //findig out the correct pos to insert
            while(prev  >=0  && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }

            //insertion
            arr[prev+1] = curr;    // curr element je currently mukvano hoi ena amte j che aa   
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,4,2,1,5};
        insertionsort(arr);
        printArr(arr);
        
    }
}