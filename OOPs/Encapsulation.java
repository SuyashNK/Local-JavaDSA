
public class Encapsulation {
    private String name; //name is privately available 
    private int id; //id is publically avalilable throughout the class

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
