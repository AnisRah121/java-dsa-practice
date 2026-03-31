package Practice;

class Instagram {
    // Overloaded login methods
    void login(String username) {
        System.out.println("Login with username: " + username);
    }

    void login(String username, String password) {
        System.out.println("Login with username: " + username + " and password: " + password);
    }
    public static void main(String[] args) {
        Instagram i1 = new Instagram();
        i1.login("anis123");
        i1.login("anis123", "password123");
    }
}