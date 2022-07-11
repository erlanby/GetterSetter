public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setAge(4);
        dog.setBreed("German Sherherd"); // немецкая овчарка
        dog.setName("Aktosh");
        dog.setWeight(7.4); // Салмагы

        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getBreed());
        System.out.println(dog.getWeight());

        dog.securityGuard();
        dog.run();

        Cat cat = new Cat();
        cat.setName("Masha");
        cat.setColor("White");
        cat.setWeight(3.0);
        cat.setAge(5);
        System.out.println( " -----------------------------------------");


        System.out.println("My name is " + cat.getName()  + " im " + cat.getAge() + " years old" + "\n" +
                " my color is " + cat.getColor() + " my weight is " + cat.getWeight());

        cat.dontLike();
        cat.sleep();

    }
}