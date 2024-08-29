import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

class SetInterface {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet();
        //s.add(10);
        s.add( 20);
        s.add( 30);
        s.add( 50);
        s.add( 10);
        s.addAll(s);
        //s.clear(); 
       // s.remove(s); 
        System.out.println(s);
        

        // for( int i :s){
        //     System.out.println(s);
        // }
 


        //Collection <Integer> ch=new HashSet<>();
        //ch.add( 50);
        //ch.addAll( s);
        //System.out.println(ch);
      // System.out.println(ch.equals(s));

       //System.out.println(s.contains(ch));
       System.out.println(s.isEmpty());
       System.out.println(s.hashCode());
      s.hashCode();
      
      System.out.println(s);
    }
    
}
