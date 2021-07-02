package e2;

public class Main {
    public static void main(String[] args) {
        Users user = new Users(
                "Andres",
                "Ramirez",
                28,
                "1",
                true
        );

        // sout
        System.out.println(user.getName());
        user.setName("Carlos");
        System.out.println(user.getName());

//        System.out.println(user.status);
    }
}
