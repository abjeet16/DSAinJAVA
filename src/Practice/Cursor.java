package Practice;

import java.util.*;

public class Cursor {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,5,6,7,8,9));

        //iterator in use
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals(1))
                iterator.remove();
        }
        System.out.println(list);

        //list iterator in use
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext())
            if (listIterator.next()==5)
                listIterator.remove();
        while (listIterator.hasPrevious())
            System.out.println(listIterator.previous());
        System.out.println(list);

        // enumeration in use
        Vector<Integer> vector = new Vector<>(List.of(4,5,6,7,8,2,6));
        Enumeration<Integer> enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            System.out.print(enumeration.nextElement()+" ");
        }
    }
}
