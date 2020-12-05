    public class MainAnimal {

        public static void main(String[] args) {
            Animal animal = new Animal();
            Cat cat1 = new Cat("Murka");
            Cat cat2 = new Cat("Dunka");
            Dog dog1 = new Dog("Drougok");
            Dog dog2 = new Dog("Barsik");
            System.out.println("Создано " + Animal.getAnimalCount() + " экземпляров класса Animal");
            System.out.println("Создано " + Cat.getCatCount() + " экземпляров класса Cat");
            System.out.println("Создано " + Dog.getDogCount() + " экземпляров класса Dog");
            cat1.run(10);
            cat2.run (1000);
            cat1.swim(15);
            dog1.run(150);
            dog2.run (650);
            dog1.swim(20);
            dog2.swim (5);

        }
    }