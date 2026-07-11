public class shortestpath{

    public static float shortestpath(String str){
        int x = 0;
        int y = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'w'){
                x--;
            }
            else if(str.charAt(i) == 'E'){
                x++;
            }
            else if(str.charAt(i) == 'N'){
                y--;
            }
            else{
                y++;
            }
        }
        int x1 = x*x;
        int y1 = y*y;
        return (float)Math.sqrt(x1 + y1);
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(shortestpath(str));
    }
}