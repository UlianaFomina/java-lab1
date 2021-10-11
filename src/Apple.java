import java.util.Locale;

public class Apple extends Food {
    private String size;

    public Apple(String size){
        super("Яблоко");//конструктор от Food
        this.size = size;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            //является ли arg0 наследником Apple
            if (!(arg0 instanceof Apple)) return false;
            //приводим объект arg0 к типу Apple
            Apple appleObject = (Apple) arg0;
            //size Apple = arg0.size
            return size.equals(appleObject.size);
        } else
            return false;
    }
    @Override
    public String toString() {
        return super.toString() + " размера '" + size.toUpperCase() + "'";
    }
    @Override
    public void consume() {
        System.out.println(this + " съедено");
    }
}
