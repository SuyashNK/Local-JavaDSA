public class superWord {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        super.sound();  // Call the parent class method
        System.out.println("Dog barks");
    }
}

