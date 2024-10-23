

abstract class Abstraction {
    abstract void print(); // abstract method
}

class use extends Abstraction {
    public void print() {
        System.out.println("Hello");
    }
}
