public class reversewords{
    public static void reverse(char[] arr , int start , int end){
        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }
    public static String reversewords(String s){
        char[] arr = s.toCharArray();
        reverse(arr , 0 , arr.length-1);
        int start = 0;
        for(int i = 0; i<= arr.length; i++){
            reverse(arr , start , i-1);
            start = i+1;

        }
        return new String(arr);

    }
    public static void main(String[] args) {
        
    }
}