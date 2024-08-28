import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Linklist1 {
    public static void main(String[] args) {
    LinkedList<String> l1 = new LinkedList<>();
    l1.add("10");
    l1.add("20");
    l1.add("30");
    l1.add("40");
    l1.add("50");
   // System.out.println(l1);

    l1.addFirst( "5");
    l1.addLast( "60");
    l1.add(2, "90");
    //l1.remove();
    //l1.clear();
    //l1.removeAll(l1);
    // System.out.println("l");
    
    // System.out.println(l1.get(0));

    // System.out.println(l1);
    // //Collection<String> cs = new LinkedList<>();
    // Collections.unmodifiableList(l1);
    // System.out.println(l1.set(0, "11"));
    // System.out.println(l1);


    List<String> ob = Collections.unmodifiableList(l1);
    //ob.add("sonam maam ");
    l1.add( "22");
    System.out.println(ob);
    System.out.println(l1);

    }
}
