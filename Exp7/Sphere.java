class Sphere extends Solid {
    double radius;
    Sphere(double r) { radius = r; }
    double calculateVolume() {
        return (4/3.0) * Math.PI * radius * radius * radius;
    }
}
