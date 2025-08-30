public class Test2 {

    public static void main(String[] args) {

//      boolean a = true;
//      boolean b = false;

        int a = 12;
        int b = 7;
        int c = (a--) + (++b);
        int d = ++c - a--;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
