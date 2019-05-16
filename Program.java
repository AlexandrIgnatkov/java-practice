package practice;
public class Program {
    public static void main(String[] args) {
        Bang bang = new Bang() {
            @Override
            public void hello() {
                System.out.println("Hello");
            }
        };
        bang.hello();


    }
}
