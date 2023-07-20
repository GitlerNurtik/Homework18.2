public class Main {
    public static void main(String[] args) {
    Shark shark = new Shark("Shark", "white", "very aggressive", 2000000);
    Turtle turtle = new Turtle("Turtle", "Green", "not aggressive", 150);
    Eagle eagle = new Eagle("Eagle", "White & Black", "aggressive", 3300);
    Animal[] animals = new Animal[]{shark,turtle,eagle};
        shark.attack();
        turtle.swim();
        eagle.fly();
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}