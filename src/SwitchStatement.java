public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = "A";

        // Switch Case
        switch (nilai) {
            case "A":
                System.out.println("Wow anda keren");
                break;
            case "B":
            case "C":
                System.out.println("Anda lulus");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Anda salah jurusan");
        }

        // Switch Lambda
        switch (nilai) {
            case "A" -> System.out.println("Wow anda keren");
            case "B", "C" -> System.out.println("Anda lulus");
            case "D" -> System.out.println("Anda tidak lulus");
            default -> {
                System.out.println("Anda salah jurusan");
            }
        }

        // Switch yield
        String ucapan;
        ucapan = switch (nilai) {
            case "A":
                yield "Wow anda keren";
            case "B":
            case "C":
               yield "Anda lulus";
            case "D":
               yield "Anda tidak lulus";
            default:
               yield "Anda salah jurusan";
        };
        System.out.println(ucapan);
    }
}
