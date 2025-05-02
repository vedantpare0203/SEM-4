package SecuritySystemDemo;

public class MainSecurity {
    public static void main(String[] args) {
        SecuritySystem ss = new SecuritySystem();
        ss.authenticateUser("admin", "1234");
    }
}
