public class Animal {
    private static int count = 0;
    public Animal() {
        count ++;
    }
    public static int getCount() {
        System.out.println("Количество животных: " + count);
        return count;
    }
    public void run(int distance) {
        System.out.println("Животное пробежало " + distance + " метров");
    }
    public void swim(int distance) {
        System.out.println("Животное проплыло " + distance + " метров");
            }

}
