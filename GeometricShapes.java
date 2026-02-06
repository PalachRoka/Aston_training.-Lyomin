public interface GeometricShapes {
    default void findPerimeter() {
        double perimeter;
        final double PI = 3.14;
        int r = 0;
        perimeter = 2 * PI * r;  // Периметр круга

        int a = 0;
        int b = 0;
        perimeter = 2 * (a + b);  // Периметр прямоугольника

        int c = 0;
        perimeter = a + b + c;  // Периметр треугольника
    };
    void findArea();
    void outputAll();
}
