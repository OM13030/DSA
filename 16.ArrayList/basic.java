
import java.util.ArrayList;

public class basic{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        ArrayList <String> list2 = new ArrayList();
        ArrayList <Boolean> list3 = new ArrayList();


        //operation to add the element in the arraylist
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //operation to get the element from a arraylist
        int element = list.get(2);
        System.out.println(element);

        System.out.println(list);

        //oparation to remove an element from a arraylist
        list.remove(2);
        System.out.println(list);

        //operation to set an element at a perticular index of an arraylist
        list.set(2,10);
        System.out.println(list);

        //operation to check wheather an element contains in a Arraylist or not
        System.out.println(list.contains(1));
        System.out.println(list.contains(45));

        //to add an element at a perticular index
        list.add(1,9);

        //to get the size of the arraylist
        System.out.println(list.size());

        //print the ArrayList
        for(int i = 0; i < list.size(); i++){
            System.out.print(" "+list.get(i));
        }
        System.out.println();
    }
}