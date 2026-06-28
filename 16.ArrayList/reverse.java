import java.util.ArrayList;


public class reverse{
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList();
        //operation to add the element in the arraylist
        list.add(1);
        list.add(78);
        list.add(7);
        list.add(4);
        list.add(7);

        for(int i = list.size()-1; i>=0; i--){
            System.out.print(" "+ list.get(i));
        }
        System.out.println();
    }
}