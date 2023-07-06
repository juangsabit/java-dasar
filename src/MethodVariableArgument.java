public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {90,90,92,80};
        sayCongrats("Juang", values);
        sayCongrats("Juang", 39,95,98,94);
        // parameter 2 tidak dibatasi
    }

    static void sayCongrats(String name, int... values) {
        int total = 0;
        for (var value : values) {
            total += value;
        }
        int avg = total / values.length;
        System.out.println(avg>=75 ? name + " Lulus" : name + " Tidak lulus");
    }
}
