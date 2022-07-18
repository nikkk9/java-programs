import java.util.LinkedList;

public class LLWithCollectionFramework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("it");
        list.addFirst("is");
        System.out.println(list);
        list.addLast("unique");
        System.out.println(list);

        // if we use only add then it will add by default in last element
        list.add("person");
        System.out.println(list);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");

        }
        System.out.println("NULL");

        // if we use only remove then it will remove by default in first element
        list.remove();
        System.out.println(list);

        // remove by index
        list.remove(1);
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

    }

}
