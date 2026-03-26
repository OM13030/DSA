public class shortest_path{
    public static float getshortestpath(String path ){
        int x = 0;int y = 0;
        for (int i = 0; i<path.length();i++){
            char dir = path.charAt(i);
            //South
            if(dir == 'S'){
                y--;
            }
            //North
            else if (dir =='N') {
                y++;
            }
            //west
            else if(dir=='W'){
                x--;
            }
            //East
            else {
                x++;
            }
        }


        float X2 = x*x;
        float Y2 = y*y;
        return (float) Math.sqrt(X2 + Y2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getshortestpath(path));
    } 
}