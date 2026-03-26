// prfit prediction ke ek array of stack mathi max profit kevi rite thse

public class assigment3{
    public static int maxProfit(int arr[]){
        int buy = arr[0];
        int profit = 0;
        for(int i = 1;i<arr.length;i++){
            if(buy < arr[i]){
                profit = Math.max(arr[i] - buy,profit);
            }
            else{
                buy = arr[i];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[] =  {1,3,4,5,7,5,6,6,9,8,3};
        System.out.println(maxProfit(arr));
    }
}