import java.util.Comparator;

class Person {
    private String name;
    private int age;



   public Person(String name,int age){
        this.name= name;
        this.age= age;
    }
    public String getName(){
        return name;
    }
    

    public int  getage(){
        return age;
    }


    public String toString(){
        return name+"("+age+")";
    }
    
}

class AgeComparator implements Comparator<Person>{
    public int compare(Person p1,Person p2){
        return Integer.compare(p1.getage(), p2.getage())
    }

}



class NameComparator implements Comparator<Person>{
    public int compare(Person p1,Person p2){
        return p1.getName().compareTo( p2.getName());
    }
}

class ComparatorExample{
    public static void main(String[] args) {
        //Creatr a list of person obj
        List<person>
    }
}