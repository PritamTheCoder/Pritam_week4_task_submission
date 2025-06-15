
// Animal Sound System
class Animal{
    public void makeSound(){
    System.out.println("Some generic Animal sound..");
}
}
// Cat, Dog and Cow
class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Meow!!");
    }
}
class Dog extends Animal{
@Override
public void makeSound(){
    System.out.println("Woff Woff!");
}
}
class Cow extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Mooo! Moo!");
    }
}
public class AnimalSounds{
    public static void main (String [] ergs){
        Animal[] animals = { new Dog(), new Cow(), new Cat()};
        for (Animal animal : animals){
            animal.makeSound();
        }

    }
} 