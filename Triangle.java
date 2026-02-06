public class Triangle implements GeometricShapes {
    double perimeter;
    double area;
    double halfmeter;
    int a;
    int b;
    int c;
    String borderColor;
    String fillColor;

    public Triangle (int a, int b, int c, String borderColor, String fillColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }
    public void findPerimeter(){
        perimeter = a + b + c;
    System.out.println("Периметр треугольника равен " + perimeter);
    }
    public void findArea(){
        halfmeter = perimeter / 2;
        area = Math.sqrt(halfmeter * (halfmeter - a) * (halfmeter - b) * (halfmeter - c));
        System.out.println("Площадь треугольника равна " + area);
    }
    public void outputAll() {
        System.out.println("Периметр треугольника равен " + perimeter);
        System.out.println("Площадь треугольника равна " + area);
        System.out.println("Цвет фона треугольника: " + fillColor);
        System.out.println("Цвет границ треугольника: " + borderColor);
    }

}
