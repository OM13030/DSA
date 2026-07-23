import java.util.*;

public class basic{

    public static void main(String[]args){

        // to create hashmap
        HashMap<String , Integer> hm = new HashMap<>();

        // to input values in hashmap
        hm.put("India" , 100);
        hm.put("china " , 34);
        hm.put("gujarat" , 67);

        // to get the value of the pertucularr key
        int population = hm.get("India");


        //to check weather a perticular key is present in hashmap or not
        System.out.println(hm.containsKey("India"));
        System.out.println(population);

        //to remove the key
        System.out.println(hm.remove("India"));
        System.out.println(hm);

        //for the iteration
        Set<String> keys = hm.keySet();
        System.err.println(keys);

        for(String k : keys){
            System.out.println("keys " + k + ", value = " + hm.get(k));
        }
    }
}