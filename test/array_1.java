public class array_1{

    public static boolean duplicat(int nums1[]){
        for(int i = 0 ; i<nums1.length ; i++){
            for(int j = i+1;j< nums1.length;j++){
                if(nums1[i] == nums1[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums1[] = {1,2,3,1};
        System.out.println(duplicat(nums1));
    }
}