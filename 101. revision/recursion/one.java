public class one{
    public static void printdec(int n) {
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
         
        printdec(n-1);
        System.out.print(n + " ");
    }
    public  static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fn = n * fact(n-1);
        return fn;
    }
    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        int sum = n + sum(n-1);
        return sum;
    }
    public static boolean isSorted(int arr[], int i){
        if( i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static int firstoccurance(int arr[] , int i, int key){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstoccurance(arr, i+1, key);
    }
    public static int lastoccurance(int arr[] , int i, int key){
        if(i == arr.length){
            return -1;
        }
        int isfound = lastoccurance(arr, i+1, key);
        if(arr[i] == key && isfound == -1){
            return i;
        }
        return isfound;
    }

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * power(x, n-1);
    }

    public static int optimizedpow(int a , int n){
        if(n == 0){
            return 1;
        }
        int halfpower = optimizedpow(a, n/2);
        int halfpowerSq = halfpower * halfpower;
        if(n % 2 != 0){
            halfpowerSq = a * halfpowerSq;
        } 
        return halfpowerSq;
    }

    public static int tillingproblem(int n){

        //base case
        if(n == 0 || n==1){
            return 1;
        }

        //kaam

        // vertical choice
        int fnm1 = tillingproblem(n-1);

        //horizontal choice
        int fnm2 = tillingproblem(n-2);

        int totways = fnm1 + fnm2;
        return totways;
    }

    public static void removeDuplicates(String str , int idx , StringBuilder newStr , boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            //duplicate
            removeDuplicates(str, idx+1, newStr, map);
        }
        else{
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }  
    } 
    public static int friendspairing(int n){
        if(n == 1 || n == 2){
            return n;
        }
        //choice
        //singel
        int fnm1 = friendspairing(n-1);

        //pair
        int fnm2 = friendspairing(n-2);
        int pairWays = (n-1) * fnm2;

        //totways
        int totways = fnm1 + pairWays;
        return totways;
    }


    public static void main(String[] args) {
        int arr[] = {2,4,45,67,4,2,6,7,5,2};
        int n = 5;
        printdec(n);

    }
}