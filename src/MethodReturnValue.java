public class MethodReturnValue {
    public static void main(String[] args) {
        System.out.println(sum(10,10));
        System.out.println(hitung(100,"+",200));
        System.out.println(hitung(100,"-",200));
        System.out.println(hitung(100,"xx",200));
    }

    static int sum(int a,int b) {
        return a + b;
    }

    static int hitung(int a, String operasi, int b) {
        switch (operasi){
            case "+":
                return a + b;
            case "-":
                return a - b;
            default:
                return 0;
        }
    }


}
