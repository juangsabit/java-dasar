public class ForEach {
    public static void main(String[] args) {
        String[] names = {
                "Juang", "Sabit", "Al Nadiev", "Marko", "Simic"
        };

        String[][] mhs = {
                {"Al"}
        };

//        for(var i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }

        for (var row : names) {
            System.out.println(row);
        }
    }
}
