public class largest{
    public static int largest(int numbers[]){
        int largest  = Integer.MIN_VALUE;
        for ( int i = 0;i<numbers.length;i++) {
            if(largest <= numbers[i]){
                largest  = numbers[i];
            }  
        }
        return largest;
    }
    public static int smallest(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0;i<numbers.length;i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return  smallest;
    }
    public static void main(String[] args) {
        int numbers[] = {0,2,3,4,6,87,35,24,7,8,7,565,6,4,6,5,76,77,7,78};

        int largest = largest(numbers);
        System.out.println("largest is : " + largest);

        int smallest = smallest(numbers);
        System.out.println("smallest number is : " + smallest);

    }
}