import java.util.ArrayDeque;
import java.util.Deque;

class DueueL {
    public static void main(String[] args) {
        Deque<String> d1 = new ArrayDeque<>();
        d1.add( "prerna");
        d1.add( "kanita");
        d1.add( "saloni");
        d1.add( "rukhamani");
        d1.addFirst( "10");
        d1.addFirst( "11");
        d1.addFirst( "12");
        d1.addFirst( "13");
        d1.addLast( "1");
        d1.addLast( "2");
        d1.addLast( "3");
        d1.addLast( "4");
        d1.addLast( "5");
       //System.out.println(d1.push( "chanchal"));
    //    System.out.println(d1.peekFirst());
    //    System.out.println( d1.peekLast());
    System.out.println(d1.pollFirst());
      //  d1.peekFirst();
        System.out.println(d1);
        
    }
}
