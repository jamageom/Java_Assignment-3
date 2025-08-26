public class Main {
    public static void main(String[] args) {
        Login user1 = new Student("Abhijit", "S101");
        Login user2 = new Faculty("Dr. Mehta", "F202");

        if (user1.login("student", "pass123")) {
            System.out.println("Student Login Successful");
            Person p = (Person) user1;
            System.out.println("Role: " + p.getRole());
            p.displayInfo();
        }

        System.out.println();

        if (user2.login("faculty", "pass123")) {
            System.out.println("Faculty Login Successful");
            Person p = (Person) user2;
            System.out.println("Role: " + p.getRole());
            p.displayInfo();
        }
    }
}
