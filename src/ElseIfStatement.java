public class ElseIfStatement {
    public static void main(String[] args) {

        var nilai = 75;
        var absen = 80;
        var message = "Nilai Anda ";

        if(nilai >= 80 && absen >= 80) {
            printLine(message + "A");
        } else if (nilai >= 70 && absen >= 70) {
            printLine(message + "B");
        } else if (nilai >= 60 && absen >= 60) {
            printLine(message + "C");
        } else if (nilai >= 50 && absen >= 50) {
            printLine(message + "D");
        } else {
            printLine(message + "E");
        }
    }

    public static void printLine(String string) {
        System.out.println(string);
    }
}
