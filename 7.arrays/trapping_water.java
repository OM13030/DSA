

public class trapping_water{
    public static int trappedRainwater(int height[]){
        int n = height.length;

        //calcuate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i < n ; i++ ){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] =  height[n-1];
        for(int i = n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]); 
        }

        //loop
        int trappedwater = 0;
        for(int i = 0;i<n;i++){

            //waterleval = min(leftmax bound, rightmax bound)
            int waterleval = Math.min(leftMax[i],rightMax[i]);

            //trapped water = waterleval - height[i]
            trappedwater += waterleval - height[i];
        }

        
        
        return trappedwater;
    }
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        int totalwater = trappedRainwater(height);
        System.out.println("total water is : " + totalwater);
    }
}



/*
public class trapping_water{
    public static int trappedRainwater(int height[]){
        int n  = height.length;

        //calculate leftmax boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i<n; i++){
            leftMax[i] = Math.max(height[i], height[i-1]);
        }


        //calculate rightmax  boundary array
        int rightMax[] = new int[n];
        rightMax[n-1] =  height[n-1];
        for(int i = n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]); 
        }

        int trappedwater = 0;
        for(int i = 0; i<n ; i++ ){

            //water level = min (leftmax , rightamx)
            int waterlevel = Math.min(leftMax[i], RightMax[i]);

            //trapped water = water level - height[i]
            trappedwater += waterlevel - height[i];
        }
        
        return trappedwater; 
    }



    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(trappedRainwater(height));
    }
}

*/