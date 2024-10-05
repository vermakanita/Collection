 // Q3Link revers 
import java.util.Iterator;
import java.util.LinkedList;



class revers{
public static void main(String args[]){
 java.util.LinkedList<String> a = new LinkedList<>();
a.add("india");
a.add("america");
a.add("russia");
a.add("dubai");
a.add("new york");

a.add(0,"japen");
a.add(5,"chine");

// for(String j:a){
// System.out.println(a.reverse(j));
// }


Iterator <String> itr= a.descendingIterator();

while(itr.hasNext()){
    System.out.println(itr.next());
}
}}


