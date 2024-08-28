import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;

class Iterator1 {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet();
        s.add( 2);
        s.add(3);
        s.add( 4);
        s.add( 5);
        s.add( 6);
        System.out.println(s);
        int count=0;



        //    Iterator itr = s.iterator();Q2
        //    while ( itr.hasNext()) {
        //     {
        //         System.out.println(itr.next());

        //     }


                // for(Integer i :s){ //Q3
                //     System.out.println(s.size());
                //     System.out.println(i);

                // }



                // s.removeAll(s);Q4
                // System.out.println(s);


            // System.out.println(s.isEmpty());Q5




            // System.out.println("original set"+s.size());


            // Integer[] newarray = new Integer[s.size()];
            // s.toArray(newarray); 
            // System.out.println("Array Element");
            // for( Integer ar: newarray){
            // System.out.println(ar);
            // }


            System.out.println("origional set"+s.size());
            Set<Integer> t = new TreeSet<Integer>(s);
            // for(Integer g :t){
            //     System.out.println("tree set"+g);
                
            // }



            for(Integer g :s){
                if(g<7){
                    count++;
                }
             }
             System.out.println(count);




             

            
           }

        Collection<Integer> c = new HashSet<>();
        
    }
    

