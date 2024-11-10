package ArrayList.basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class introduction {
    public static void main(String[] args) {
        //declaration
        ArrayList<Integer> list = new ArrayList<>();
        //adding elements
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        
        //get element
        System.out.println(list.get(0));

        //size
        System.out.println(list.size());

        //add at a index
        list.add(1,4);
        System.out.println(list);

        //remove at index
        list.remove(1);
        System.out.println(list);

        //change element at a index
        list.set(1,5);
        System.out.println(list);

        //sorting
        list.sort(null);
        Collections.sort(list);
        System.out.println(list);

        //clear
        list.clear();
        System.out.println(list);
    }
}
