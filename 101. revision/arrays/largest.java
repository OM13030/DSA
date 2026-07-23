import java.util.*;
public class largest{
    public static int largest(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i <= arr.length-1; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter " + n + "elements : ");
        for(int i = 0; i <= n-1; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("the largest is "+ largest(arr));
    }
}