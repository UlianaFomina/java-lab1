//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class IceCream extends Food {
    private String sirup;

    public IceCream(String sirup) {
        super("Мороженное");
        this.sirup = sirup;
    }

    public String getSirup() {
        return this.sirup;
    }

    public void setSirup(String sirup) {
        this.sirup = sirup;
    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof IceCream)) {
                return false;
            } else {
                IceCream appleObject = (IceCream)arg0;
                return this.sirup.equals(appleObject.sirup);
            }
        } else {
            return false;
        }
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + " с сиропом '" + this.sirup.toUpperCase() + "'";
    }

    public void consume() {
        System.out.println(this + " съедено");
    }
}
