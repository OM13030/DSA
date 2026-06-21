public class example{

     public static void changeArray(int arr[], int i, int val){
        //base case
        if(i == arr.length){
            printArr(arr);
            return ;
        }
        //recursion
        arr[i] = val;
        changeArray(arr, i+1, val+1);
        arr[i] = arr[i] - 2;

     }

     public static void printArr(int arr[]){


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
     }

    public static void findSubsets(String str , String ans , int i){
        //base case
        if(i == str.length()){
            System.out.println(ans);
            return;
        }

        //yes choice
        findSubsets(str, ans + str.charAt(i), i+1);

        // no choice
        findSubsets(str, ans, i+1);
    }

    public static void findpermutation(String str, String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // "abcde" => "ab" + "de" = "abde"
            String NewStr = str.substring(0,i) + str.substring(i+1);
            findpermutation(NewStr, ans+ curr);
        }

    }


    public static void main(String[] args) { 

        // int arr[] = new int [5];
        // changeArray(arr, 0, 1);
        // printArr(arr);
        String str = "abc";
        // findSubsets(str, "",0);
        findpermutation(str, "");
    }
}