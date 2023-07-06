public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        // Tipe data bukan primitif adalah objek yang memiliki method

        Integer iniInteger = 10;
        Long iniLong = 10000L;

        Byte iniByte = null;
        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);

        int iniInt = iniInteger;
        int age = 30;
        Integer ageObject = age;
        int ageAgain = ageObject;

        short shortAge = ageObject.shortValue();
        System.out.println(shortAge);
        byte byteAge = ageObject.byteValue();
        System.out.println(byteAge);
    }
}
