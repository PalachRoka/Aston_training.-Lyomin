public class Rectangle implements GeometricShapes {
    int perimeter;
    int area;
    int a;
    int b;
    String borderColor;
    String fillColor;
    public Rectangle (int a, int b, String borderColor, String fillColor) {
        this.a = a;
        this.b = b;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }
    public void findPerimeter(){
        perimeter = 2 * (a + b);
    System.out.println("Периметр прямоугольника равен " + perimeter);
    }
    public void findArea(){
        area = a * b;
    System.out.println("Площадь прямоугольника равна " + area);
    }
    public void outputAll() {
        System.out.println("Периметр прямоугольника равен " + perimeter);
        System.out.println("Площадь прямоугольника равна " + area);
        System.out.println("Цвет фона прямоугольника: " + fillColor);
        System.out.println("Цвет границ прямоугольника: " + borderColor);
    }

}