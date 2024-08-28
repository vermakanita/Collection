 class container< T >{
    T value;
    public void Show(){
        System.out.println(value.getClass().getName());
    }
}
public class Demo {
    public static void main(String[] args) {
    container<Integer> c = new container<>();
    c.value=20;
    
    System.out.println("kk");
    c.Show();
    }
}
