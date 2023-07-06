public class Array {
    public static void main(String[] args) {
        String[] strArr;
        strArr = new String[3];

        strArr[0] = "Juang";
        strArr[1] = "Sabit";
        strArr[2] = "Al";

        System.out.println(strArr[0]);

        // Array Init
        String[] strArr2 = new String[] {
                "A", "B", "C"
        };

        // Array Init
        int[] arrInt = {
          1,2,3,4,5,6
        };

        System.out.println(arrInt.length);
        System.out.println(arrInt[0]);

        String[][] members = {
                {"Juang", "Sabit"},
                {"Al", "Nadiev"},
                {"Bambang", "Pamungkas"}
        };

        System.out.println(members[0][0]); // Juang
        System.out.println(members[0][1]); // Sabit
        System.out.println(members[1][0]); // Al
        System.out.println(members[1][1]); // Nadiev
    }
}
