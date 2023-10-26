public class Increments {
    public static void main(String[] args){
        int a = 1;
        int b = a++;
        int c = b++;

        System.out.println("a: " +a);
        System.out.println("b: " +b);
        System.out.println("c: " +c);

        int d = 1;
        int e = ++d;
        int f = ++e;

        System.out.println("d: " + d);
        System.out.println("e: " + e);
        System.out.println("f: " + f);
    }
}
