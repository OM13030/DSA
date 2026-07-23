public class merged{
    public static int[] merged(int arr1[] , int arr2[]){
        int merged[] = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                merged[k] = arr1[i];
                i++;
            }else{
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i < arr1.length){
            merged[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {5,6,7,8};
        int merged[] = merged(arr1, arr2);
        for(int i = 0; i <= merged.length-1; i++){
            System.out.print(merged[i] + " ");
        }
    }
}