public class reverse{
    public static void reverse(int numbers[]){
        int first = 0;
        int last = numbers.length-1;
        int temp ;
        while(first < last){
              temp = numbers[last];
              numbers[last] = numbers[first];
              numbers[first] = temp;

              first++;
              last--;  
        }
    }
    public static void main(String[] args) {
        int numbers[] = {12,34,5,9,65,23};

        reverse(numbers);
        for(int i = 0; i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println( );
    }
}

// time complexity = n;
// space complexity = 1(karanke ek akho navo array nthi banavo padto)