public class PowerOf2OrNot{
    public static boolean PowerOf2OrNot(int n ){
        // property = n & (n-1) = 0  always means n is a power of 2
        // avu etla mate thay che karank ke 2 ni power vada numbers ma darr vakhate left ma single 1 hse for EG - 4=100 , etc ani eni just pelana number ma single left most mikune badha 1 hse for EG ~ 8-1 = 7 = 0111 ane etle bannei nu jyare AND nikde tyare 0 ave


        if((n & (n-1)) == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[]args){
        int n = 1656; 
        System.out.println(PowerOf2OrNot(n));

    }
} 