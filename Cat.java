public class Cat extends Animal {
    int foodInBowl = 20;
    static int foodInBigBowl = 15;
    static int food;
    static int foodNeed;
    String name;
    static boolean satiety;
    private static int count = 0;

    public Cat(String name, boolean satiety) {
        this.name = name;
        this.satiety = false;
        count++;
    }
    public static int getCount() {
        System.out.println("Количество котов: " + count);
        return count;
    }
    @Override
    public void run(int distance) {
        if (distance <= 200) {
        System.out.println(this.name + " пробежал(а) " + distance + " метров");
    }
        else {
        System.out.println(this.name + " пробежал(а) 200 метров. Дальше не побежит");
        }
    }
    @Override
    public void swim(int distance) {
        System.out.println(this.name + " не умеет плавать");
    }
    public void eat(int foodNeed) {
        if (foodInBowl >= foodNeed) {
            satiety = true;
            System.out.println("Сытость кота " + this.name + ": " + satiety);
        }
        else {
            System.out.println("Сытость кота " + this.name + ": " + satiety);
        }}

    public static void fillBigBowl(int food) {
        if (foodInBigBowl + food >= 50) {
            foodInBigBowl = 50;
            System.out.println("Миска заполнена кормом");
        }
        else {
            foodInBigBowl += food;
            System.out.println("Количество корма в миске: " + foodInBigBowl);
        }
    }

    public void allEat(int foodNeed) {
        if (foodInBigBowl >= foodNeed) {
            satiety = true;
            foodInBigBowl -= foodNeed;
            System.out.println("Сытость кота " + this.name + ": " + satiety +
                    ". Осталось корма: " + foodInBigBowl);
        }
        else {
            satiety = false;
            System.out.println("Сытость кота " + this.name + ": " + satiety +
                    ". Осталось корма: " + foodInBigBowl + ". Коту нужно больше еды!");
        }

    }
    }
