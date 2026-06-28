import java.util.ArrayList;

public class maximum{
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
         ArrayList<Integer> list = new ArrayList();
        //operation to add the element in the arraylist
        list.add(5);
        list.add(7);
        list.add(12);
        list.add(4);
        list.add(2);

        //to find the maximum
        for(int i = 0; i < list.size(); i++){
            // if(list.get(i) > max){
            //     max = list.get(i);
            // 
             
        }
        System.out.println("max element : "+ max);
    }
}