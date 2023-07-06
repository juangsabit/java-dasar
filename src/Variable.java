public class Variable {
    public static void main(String[] args) {
        String name, address;
        int age;

        name = "Juang Sabit Al Nadiev";
        age = 30;
        address = "Indonesia";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        name = "Budi Sudarsono";
        System.out.println(name);

        var number = "23";
        var numerik = isNumeric(number) ? true : false ;
        System.out.println(numerik);

        final var strFinal = "Al Nadiev";
        // strFinal = "zzz" // error
    }

    public static boolean isNumeric(String string) {
        int intValue;

        System.out.println(String.format("Parsing string: \"%s\"", string));

        if(string == null || string.equals("")) {
            System.out.println("String cannot be parsed, it is null or empty.");
            return false;
        }

        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Integer.");
        }
        return false;
    }
}
