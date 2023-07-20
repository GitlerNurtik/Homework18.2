public class Shark extends Animal{
    public Shark(String name, String skin, String aggressive, int price) {
        super(name, skin, aggressive, price);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void attack(){
        System.out.println(getName()+" can attack");
    }
}
