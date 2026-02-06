public class Main {
    public static void main(String[] args) {
    Animal animal = new Animal();
    Dog dog1 = new Dog("Жучка");
    Cat cat1 = new Cat("Барсик", false);
    Cat cat2 = new Cat("Матроскин", false);
    Cat cat3 = new Cat("Мурзик", false);
    Cat[] arrCats = {cat1, cat2, cat3};

    animal.run(200);
    animal.swim(400);
    cat2.swim(201);
    dog1.swim(11);
    cat1.eat(21);
    Cat.getCount();
    Cat.fillBigBowl(15);
    cat2.allEat(10);
    cat1.allEat(4);
    cat3.allEat(17);
    cat1.allEat(4);
        }
    }