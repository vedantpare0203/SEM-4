public class SecurityTest {
    public static void main(String[] args) {
        SecuritySystem system = new SecuritySystem();
        system.authenticateUser("admin", "1234");
    }
}
