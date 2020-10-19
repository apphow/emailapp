public class Main {

    public static void main(String[] args) {
        Email employee1 = new Email("April", "Howard");
        employee1.setAlternateEmail("app@gmail.com:");

        System.out.println(employee1.showInfo());

    }
}
