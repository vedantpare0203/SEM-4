package SecuritySystemDemo;

public final class SecuritySystem {
    public void authenticateUser(String username, String password) {
        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("User authenticated.");
        } else {
            System.out.println("Authentication failed.");
        }
    }
}
