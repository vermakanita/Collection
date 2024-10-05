import java.util.HashMap;
public class Q9 {
    public static void main(String[] args) {
        HashMap<String , Integer> h= new HashMap<>();
        h.put("kanita",90);
        h.put("kirti",100);
        int cal=0;
        for(int marks:h.values()){
            cal=cal+marks;
        }
        double vm =(double)cal/h.size();
        System.out.println(vm);

        
    }
    
}
