 

 
 import java.util.ArrayList;
 import java.util.Arrays;
 import java.util.LinkedList;
 import java.util.Iterator;
 

public class Q1Remove {
    public static void main(String[] args) {
        
    

    ArrayList<Integer> a= new ArrayList<>();
    a.add(1);
    a.add( 2);
    a.add(3);
    a.add( 4);
    a.add(5);
    System.out.println(a);

    Iterator<Integer> iterator = a.iterator();
    while(iterator.hasNext()){
        int j=iterator.next();
        if(j%2!=0){
            iterator.remove();
        }
    }
    System.out.println(a);

    //   for(int j:a){
    //     if(j%2!=0){
    //     a.remove(j);
    //     }
    
      
         
         //System.out.println(a);
      
    

    

      
   


    }
}
