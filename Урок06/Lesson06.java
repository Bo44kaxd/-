public class Dz6 {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog02(), new Dog01(), new Dog03()};

        for (Animal animal : animals) {
            System.out.printf("%s run: %s\n",
                    animal.getClass().getSimpleName(),
                    animal.run(201));

            System.out.printf("%s jump: %s\n",
                    animal.getClass().getSimpleName(),
                    animal.jump(0.5));

            System.out.printf("%s swim: %s\n\n",
                    animal.getClass().getSimpleName(),
                    animal.swim(8));
        }

        Animal cat = new Cat();
        Animal Dog02 = new Dog02();
        Animal Dog01 = new Dog01();

        assert !cat.run(201);
        assert cat.run(200);

        assert !Dog02.run(0);
        assert !Dog02.run(351);
        assert Dog02.run(350);

        assert Dog01.run(351) == true;
        assert Dog01.run(560) == true;
        assert Dog01.run(561) == false;
    }
}
