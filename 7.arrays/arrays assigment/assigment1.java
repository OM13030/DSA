public class assigment1{
    public static boolean findDuplicate( int arr[]){
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){  
                //  j = i+1 leva yd rakhvu karanke nakar j dar vakhatei thi kato 0 kato 1 thi chalu thse to ej value biji var consider karse ane always trye return karse
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        boolean x = findDuplicate(arr);
        System.out.println(x);

        
    }
}