package Domain;


import java.util.Iterator;
import java.util.List;


public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
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
        return "StudentGroup No " + id + ": " + "Кол-во студентов в группе: " + this.getStudentList().size() + ", groupId: " + id + "\n Список студентов: \n" + studentList +  ".";
    }


    //Перезаписываем метод iterator
    @Override
    public Iterator<Student> iterator() {
        // TODO Auto-generated method stub
        return new StudentIterator(studentList);
    }

    //Перезаписываем compareTo
    @Override
    public int compareTo(StudentGroup o) {
        // TODO Auto-generated method stub
        if (o.getStudentList().size() > this.getStudentList().size()){
            return -1;
        };
        if(o.getStudentList().size() < this.getStudentList().size()) {
            return 1;
        };

        //Если кол-во студентов в группах одинаковое, то сравниваем по id группы
        if(o.getId() > id) {
            return 1;
        }
        if(o.getId() < id) {
            return -1;
        }

        return 0;
    }
    
}
