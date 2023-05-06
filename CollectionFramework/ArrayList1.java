package CollectionFramework;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList al1 = new ArrayList();
        al1.add(10);
        al1.add(20);
        al1.add(200);

        // System.out.println(al1.contains(2));
        // int index = al1.indexOf(20);
        // System.out.println(index);
        // System.out.println(al1.size());
        // al1.ensureCapacity(10);
        // // al1.trimToSize();
        // System.out.println(al1.size());
        al1.clear();
        al1.add(300);
        System.out.println(al1);
        
    }
}
