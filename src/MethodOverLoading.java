// Method dengan nama yang sama, dibedakan dengan banyaknya parameter
public class MethodOverLoading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Juang Sabit");
        sayHello("Al Nadiev");
    }
    static void sayHello() {
        System.out.println("Hello");
    }

    static void sayHello(String fullname) {
        System.out.println("Hello" + fullname);
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
