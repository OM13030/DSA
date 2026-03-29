import java.util.Arrays;
import java.util.Collections;

public class inbuilt{
    public static void printArr(Integer arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Integer arr[] = {1,3,2,4,5};
        //Arrays.sort(arr);
        //Arrays.sort(arr,0,3);
        Arrays.sort(arr,Collections.reverseOrder());
        
        printArr(arr);

        // it pr kam nai kre collections ena mate integer lakhvu padse jenathi object ma convvert thy jse

        
    }
}