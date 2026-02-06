public class Dog extends Animal {
    String name;
    private static int count = 0;
    public Dog(String name) {
        this.name = name;
        count++;
    }
    public static int getCount() {
        System.out.println("Количество собак: " + count);
        return count;
    }
    @Override
    public void run(int distance) {
        if (distance <= 500) {
        System.out.println(this.name + " пробежал(а) " + distance + " метров");
    }
        else {
            System.out.println(this.name + " пробежал(а) 500 метров. Дальше не побежит");
        }
    }
    @Override
    public void swim(int distance) {
        if (distance <= 10) {
        System.out.println(this.name + " проплыл(а) " + distance + " метров");
    }
        else {
            System.out.println(this.name + " проплыл(а) 10 метров. Дальше не поплывёт");
        }
    }
}