public final class SecuritySystem {
    public void authenticateUser(String username, String password) {
        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("Authentication successful!");
        } else {
            System.out.println("Authentication failed!");
        }
    }
}
