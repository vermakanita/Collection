
import java.util.HashMap;
public class HashMap{
    public static void main(String[] args) {
        HashMap<String,Integer> h = new HashMap<>();
        h.put("shope",90);
        h.put("shoke",70);
        h.put("shore",80);

        h.put("shoke",100);
        System.out.println(h);

    }
}