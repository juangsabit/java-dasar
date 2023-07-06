public class Komentar {
    // Komentar adalah kode program yang akan di hiraukan saat proses kompilasi, sehingga di binary code Java, tidak akan ada kode komentar tersebut
    // Digunakan untuk dokumentasi
    public static void main(String[] args) {
        int result = sum(2,4);
        System.out.println(result);
    }

    /*

     */

    // Ketika dicompile komentar akan dihapus
    /**
     *
     * @param val1 angka pertama
     * @param val2 angka kedua
     * @return hasil penjumlahan
     */
    static int sum(int val1, int val2) {
        // jumlahkan val 1 dengan val 2
        return val1 + val2;
    }
}
