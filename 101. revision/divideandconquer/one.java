public class one{
    public static void printArr(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si , int ei){
        if(si >= ei){
            return;
        }

        // kaam
        int mid = si + (ei - si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);


    }

    public static void merge(int arr[],int si,int  mid,int  ei){
        int temp[] = new int[ei-si+1];
        int i = si;     // iterator for left part
        int j = mid + 1;   // iterator for right part
        int k = 0;     // iterator for temp arr

        while(i <= mid && j <= ei){
            if(arr[i]< arr[j]){
                temp[k] = arr[j];
                i++; 
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //left part
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        //rigth part
        while(i <= mid){
            temp[k++] = arr[j++];
        }

        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
            
        }
    }

    public static void quicksort(int arr[] , int si , int ei){



         //last element
         int pidx = partition(arr, si , ei);
         quicksort(arr, si, pidx-1);   //left
         quicksort(arr, pidx+1, ei);   //right
         
    }

    public static int partition(int arr[] , int si , int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j = si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                //swaping
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        //swaping for pivot 
        int temp = pivot;
        arr[si] = arr[i];// pivot = arr[i]
        arr[i] = temp;
        return i; 

          
    }

    public static int search(int arr[], int tar, int si , int ei){
        if(si > ei){
            return -1;
        }
        //kaam
        int mid = si + (ei - si) / 2;


        //case found
        if(arr[mid] == tar){
            return mid;
        }

        //mid on l1
        if(arr[si] <= arr[mid]){
            //case a : left
            if(arr[si] <= tar && tar <= arr[mid]){
                return search(arr, tar, si, mid);
            }
            else{
                //case B : right
                search(arr, tar, mid+1, ei);
            }
        }

        //mid on L2
        else{
            //case c : right
            if(arr[mid]<= tar && tar <= arr[ei]){
                return search( arr , tar, mid+1, ei);
            }
            else{
                //case d : left
                return search(arr, tar, si, mid-1);
            }
        }
    }


    public static void main(String[] args) {
        int arr[] = {21,3,5,45,65,2,34,7};
    }
}