
// import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add element
        list.add(2);
        list.add(8);
        list.add(4);

        System.out.println(list);

        // add element in between
        list.add(1, 9);
        System.out.println(list);

        // get element
        System.out.println(list.get(3));

        // set element / change element
        list.set(2, 3);
        System.out.println(list);

        // remove element
        list.remove(2);
        System.out.println(list);

        // get size
        System.out.println(list.size());

        // loops
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }

        // sorting
        Collections.sort(list);
        System.out.println(list);

    }

}
