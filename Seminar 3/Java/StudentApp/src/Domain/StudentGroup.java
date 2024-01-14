package Domain;


import java.util.Iterator;
import java.util.List;


public class StudentGroup implements Iterable<Student> {
    //Поля
    //Переменная, принимающая список
    private List<Student> studentList;
    //Переменная id
    private int id;

    // Конструктор
    public StudentGroup(List<Student> studentList, int id) {
        this.studentList = studentList;
        this.id = id;
    }

    //Геттеры и сеттеры
    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    //Перезаписываем toString
    @Override
    public String toString() {
        return "StudentGroup: " + studentList + ", id: " + id + ".";
    }


    //Перезаписываем метод iterator
    @Override
    public Iterator<Student> iterator() {
        // TODO Auto-generated method stub
        return new StudentIterator(studentList);
    }
    
    
    
}
