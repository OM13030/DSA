public class searching{


    // tme complexity = O(m+n)karan ke worst case laiye toi akhi ek column and ek akhi row use thse maximum
    public static boolean staircaseSearch(int matrix[][] , int key) {
        int row = 0;int  col = matrix[0].length-1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("faound key at index (" + row + "," + col + ")");
                return true;
            }
            else if(key < matrix[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("key not found");
        return false;   
      }


    //binary search ma pan loop to be lagse pan nlogn complexity thy jse 
    //ane ama column pan sorted che eno use karyo j  nthi to hve bannei no use karine staircase function bani ske che
    public static int[] binarySearch(int matrix[][] , int key){
        for(int i = 0;i<matrix.length;i++){
            int low = 0;
            int high  = matrix[i].length-1;
            while (low <= high){
                int mid = (high + low)/2;
                if (matrix[i][mid] == key) {
                    return new int[]{i, mid};
                }else if(matrix[i][mid] < key){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
                
            }
        }
        return new int[]{-1,-1};
        
    }


    // time complexity is very high due to 2 loops
    public static int[] linearSearch(int matrix[][] , int key){
        // time complexity is very high due to 2 loops
        for (int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j]== key){
                   return new int[]{i,j};
                }
                
            } 
        } 
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        int key = 33;
        // int [] result = binarySearch(matrix, key);
        // if(result[0] == (-1)){
        //     System.out.println("not found");
        // }else{
        //     System.out.println("found at index (" + result[0] + "," + result[1] + ")");
        // }
        staircaseSearch(matrix, key);


        

    }
}