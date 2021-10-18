public class Сheese extends Food{

    public Сheese(String name) {
        super("Сыр");
    }

    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public void consume() {
        System.out.println(this + " съеден");
    }

}
