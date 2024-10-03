import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Student2 {
   String name;
   int marks;

   Student2(String name,int marks){
       this.name= name;
       this.marks=marks;
   }

   public String getName(){
       return name;
   }

   public int getMarks (){
       return marks;
   }

   public String toString(){
       return "name"+ name+"marks"+marks;
   }
}
public class Q3{
   public static void main(String args[]){
       ArrayList<Student2> s = new ArrayList<>();
       s.add(new Student2("kanita",90));
       s.add(new Student2("kirti",89));
       s.add(new Student2("prerna",70));
       s.add(new Student2("saloni",100));
    System.out.println(s);
       Collections.sort(s,new Comparator<Student2>(){
           public int compare(Student2 s1,Student2 s2){
               return Integer.compare(s1.getMarks(),s2.getMarks());
           }
       });

       for(Student2 j:s){
           System.out.println(j);
       }
   }
}
