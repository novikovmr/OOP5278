package Domain;

public class Employe extends Person{
    private String special;

    public Employe(String name, int age, String special) {
        super(name, age);
        this.special = special;
    }
    
}
