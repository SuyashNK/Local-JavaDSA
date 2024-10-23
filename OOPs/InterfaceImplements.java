public class InterfaceImplements {
    public static void main(String[] args) {
        
    }
}


interface Animal {
    void sound();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
