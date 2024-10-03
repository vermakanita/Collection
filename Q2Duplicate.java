import java.util.ArrayList;
import java.util.Arrays;

public class Q2Duplicate {
    public static void main(String[] args) {
        
    
    ArrayList <Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4,56,7,2,23));
    ArrayList<Integer> na = new ArrayList<>();
    


    for(int j:a){
       if (!na.contains(j)){
        na.add(j);
            
        }

    }
    System.out.println(na);
    
}
}