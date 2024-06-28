package basics;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
     ArrayList<Integer> list = new ArrayList<>(10);
     list.add(67);
     list.add(678);
     list.add(6789);
     list.add(678910);

     System.out.println(list);
     System.out.println(list.contains(678));
     list.set(0, 99);
     System.out.println(list.get(0));
     list.remove(0);
     System.out.println(list);
    }
}
