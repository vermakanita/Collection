 import java.util.Stack;
 class Q10 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);

        while (!s.isEmpty()) {
            int num = s.pop();
            System.out.println(num);
            
        }
    }
    
}
