public class Animal {
    private String name;
    private String skin;
    private String aggressive;
    private int price;

    public Animal(String name, String skin, String aggressive, int price) {
        this.name = name;
        this.skin = skin;
        this.aggressive = aggressive;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getSkin() {
        return skin;
    }

    public String getAggressive() {
        return aggressive;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public void setAggressive(String aggressive) {
        this.aggressive = aggressive;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", skin='" + skin + '\'' +
                ", aggressive='" + aggressive + '\'' +
                ", price=" + price +
                '}';
    }

    public void voice (){

    }
}
