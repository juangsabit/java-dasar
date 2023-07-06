public class OperasiMatematika {
    public static void main(String[] args) {

        int a = 100;
        int b = 9;

        // operasi matematika dasar
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        int c = 100;
        c = c + 10;
        System.out.println(c);

        // augmented assignments
        c += 10;
        System.out.println(c);
        c -= 10;
        System.out.println(c);
        c *= 10;
        System.out.println(c);
        c /= 10;
        System.out.println(c);

        // unary operation
        c++;
        System.out.println(c);
        c--;
        System.out.println(c);
        System.out.println(!true);

    }
}
