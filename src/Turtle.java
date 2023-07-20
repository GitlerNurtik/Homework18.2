public class Turtle extends Animal{
    public Turtle(String name, String skin, String aggressive, int price) {
        super(name, skin, aggressive, price);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void swim(){
        System.out.println(getName()+" can swim");
    }
}
