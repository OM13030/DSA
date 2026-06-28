
import java.util.*;
import static java.util.Collections.sort;


public class sorting{
    public static void main(String[] args) {
          ArrayList<Integer> list = new ArrayList();
        //operation to add the element in the arraylist
        list.add(5);
        list.add(7);
        list.add(12);
        list.add(4);
        list.add(2);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        //descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}