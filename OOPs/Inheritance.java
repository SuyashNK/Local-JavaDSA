
public class Inheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.print();
    }
}

class Parent {
    public void print(){
        System.out.println("I am a parent");
    }
}

class Child extends Parent{
    public void print(){
        System.out.println("I am a child");
    }
}
