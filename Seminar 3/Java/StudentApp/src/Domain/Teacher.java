package Domain;

public class Teacher extends Person{
    private String academicDegreed;

    public Teacher(String name, int age, String academicDegreed) {
        super(name, age);
        this.academicDegreed = academicDegreed;
    }


}
