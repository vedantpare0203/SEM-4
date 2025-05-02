public class SolidTest {
    public static void main(String[] args) {
        Solid c = new Cuboid(2, 3, 4);
        Solid s = new Sphere(3);
        System.out.println("Cuboid Volume: " + c.calculateVolume());
        System.out.println("Sphere Volume: " + s.calculateVolume());
    }
}
