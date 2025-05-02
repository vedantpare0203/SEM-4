class Cuboid extends Solid {
    double length, width, height;
    Cuboid(double l, double w, double h) {
        length = l; width = w; height = h;
    }
    double calculateVolume() {
        return length * width * height;
    }
}
