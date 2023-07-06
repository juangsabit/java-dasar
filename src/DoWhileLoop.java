public class DoWhileLoop {
    public static void main(String[] args) {

        // minimal menghasilkan satu kali perulangan
        var counter = 1;
        do {
            System.out.println("Perulangan " + counter);
            counter ++;
        } while (counter <= 5);
    }
}
