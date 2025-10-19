public class Dog {
    String name;
    String breed;
    int age;

     public void bark() {
        System.out.println(name + " barks loudly! Woof!");
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Buddy";
        dog1.breed = "Golden Retriever";
        dog1.age = 3;

        Dog dog2 = new Dog();
        dog2.name = "Rocky";
        dog2.breed = "German Shepherd";
        dog2.age = 4;

        System.out.println("Dog 1: " + dog1.name + ", " + dog1.breed + ", Age: " + dog1.age);
        dog1.bark();

        System.out.println("Dog 2: " + dog2.name + ", " + dog2.breed + ", Age: " + dog2.age);
        dog2.bark();
    }
}
