package chap01_03abstactlayer.abstract_class;

public abstract class AbstractClass {
    public void implementedMethod() {
        System.out.println("AbstractClass implementedMethod");
        this.abstractMethod();
    }

    abstract public void abstractMethod();
}
