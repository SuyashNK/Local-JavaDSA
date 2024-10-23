
public class AllInOne {
public static void main(String[] args) {
    Child child = new Child();
    child.printParent();
    child.printChild();

    Encapsulation en = new Encapsulation();
    en.setId(1);
    en.setName("Suyash");
    System.out.println(en.getId());
    System.out.println(en.getName());

    }
}

class Encapsulation{
    private String name;
    private int id;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
}

class Parent{
    void printParent(){
        System.out.println("I am a parent");
    }
}

class Child extends Parent{
    public void printChild(){
        System.out.println("I am a child");
    }
}