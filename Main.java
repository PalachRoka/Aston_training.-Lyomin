public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle(15, "Красный", "Красный");
        Rectangle rectangle1 = new Rectangle(4,7, "Чёрный", "Синий");
        Triangle triangle1 = new Triangle(5,7,9, "Чёрный", "Зелёный");
        circle1.findPerimeter();
        circle1.findArea();
        rectangle1.findArea();
        rectangle1.findPerimeter();
        triangle1.findPerimeter();
        triangle1.findArea();
        circle1.outputAll();
        triangle1.outputAll();
        rectangle1.outputAll();

    }
}