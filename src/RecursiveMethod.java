// Recursive method adalah kemampuan method memanggil method dirinya sendiri
public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
        System.out.println(factorialRecursive(5));
        // Jika recursive terlalu dalam, maka  akan ada kemungkinan  terjadi error StackOverflow, yaitu error dimana stack method terlalu banyak di Java
        loop(10);
    }

    static int factorialLoop(int value) {
        var result = 1;
        for (var counter=1; counter <= value; counter++) {
            result *= counter;
        }
        return result;
    }

    static int factorialRecursive(int value){
        if(value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }

    // recursive loop
    static void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop " + value);
            loop(value - 1);
        }
    }
}
