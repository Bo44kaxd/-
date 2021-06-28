public class Lesson07 {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("cat1", 10),
                new Cat("cat2", 15),
                new Cat("cat3", 25),
                new Cat("cat4", 5),
                new Cat("cat5", 1)
        };

        Plate plate = new Plate(30);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }

        plate.addFood(50);
        plate.info();
    }

}
