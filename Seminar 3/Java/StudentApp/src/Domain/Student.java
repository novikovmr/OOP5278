package Domain;

public class Student extends Person implements Comparable<Student>{
    //Поля
    private int id;
    //Переменная для генерации id студента
    static int generalId;


    // Конструктор
    public Student(String name, int age) {
        super(name, age);
        this.id = generalId;

        generalId++;
    }


    //Геттеры и сеттеры

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    // Переопределяем toString
    @Override
    public String toString() {
        return "Student " + super.toString() + " id: " + id;
    }

    //Перезаписываем метод compareTo
    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub

        // System.out.println(super.getName() + "-" + o.getName()); // Смотрим под капот
        if (o.getAge() > super.getAge()){
            return -1;
        };
        if(o.getAge() < super.getAge()) {
            return 1;
        };
        if(o.getId() > id) {
            return 1;
        }
        if(o.getId() < id) {
            return -1;
        }
        return 0;
    }
    
}
