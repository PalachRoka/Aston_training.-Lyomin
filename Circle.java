public class Circle implements GeometricShapes {
    double perimeter;
    double area;
    final double PI = 3.14;
    int r;
    String borderColor;
    String fillColor;
    public Circle (int r, String borderColor, String fillColor) {
        this.r = r;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }


    public void findPerimeter(){
        perimeter = 2 * PI * r;
        System.out.println("Периметр круга равен " + perimeter);
    }
    public void findArea(){
        area = r * r * PI;
        System.out.println("Площадь круга равна " + area);
    }
    public void outputAll() {
    System.out.println("Периметр круга равен " + perimeter);
    System.out.println("Площадь круга равна " + area);
    System.out.println("Цвет фона круга: " + fillColor);
    System.out.println("Цвет границ круга: " + borderColor);
    }
}

