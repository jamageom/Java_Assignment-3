class Student extends Person implements Login {
    Student(String name, String id) {
        super(name, id);
    }

    @Override
    public boolean login(String username, String password) {
        return username.equals("student") && password.equals("pass123");
    }

    @Override
    String getRole() {
        return "Student";
    }
}
