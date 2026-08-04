class Box {
    double width, height, depth;
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double getVolume() {
        return width * height * depth;
    }
}
public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(5.0, 4.0, 3.0);
        System.out.println("Width  : " + box1.width);
        System.out.println("Height : " + box1.height);
        System.out.println("Depth  : " + box1.depth);
        System.out.println("Volume of the box = " + box1.getVolume());
    }
}