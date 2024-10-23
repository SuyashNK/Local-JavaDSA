public class Polymorphism {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(10,20));
        System.out.println(cal.add(10.0,20.0,30.0));


        Child ch = new Child();
        ch.printParent();
        ch.printChild();
    }
}

class Calculator{ // Compile time polymorphism - Method overloading
    int add(int a,int b){
        return a+b;
    }

    double add(double a, double b, double c){
        return a+b+c;
    }
}

class Parent{ // runtime polymorphism - method overriding
    void printParent(){
        System.out.println("I am a parent");
    }
}

class Child extends Parent{
    void printChild(){
        System.out.println("I am a child");
    }
}
