class Faculty extends Person implements Login {
    Faculty(String name, String id) {
        super(name, id);
    }

    @Override
    public boolean login(String username, String password) {
        return username.equals("faculty") && password.equals("pass123");
    }

    @Override
    String getRole() {
        return "Faculty";
    }
}
