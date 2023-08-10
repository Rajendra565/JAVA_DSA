
public class whitouttempvariable {
    public static void main(String[] args) {
        int a=10;
        int b=20;
    System.out.println("befor swap ");
    System.out.println("a "+a);
    System.out.println("b "+b);
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After swep ");
        System.out.println("a "+a);
        System.out.println("b "+b);
    }
}
