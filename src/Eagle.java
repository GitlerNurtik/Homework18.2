public class Eagle extends Animal{
    public Eagle(String name, String skin, String aggressive, int price) {
        super(name, skin, aggressive, price);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void fly(){
        System.out.println(getName()+" can fly");
    }
}
