import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domain.Person;
import Domain.Student;
import Domain.StudentGroup;

public class App {
    public static void main(String[] args) {

        //Создание экземпляров класса
        Student student5 = new Student("Анастасия", 19);
        Student student1 = new Student("Максим", 23);
        Student student6 = new Student("Сергей", 19);
        Student student2 = new Student("Дарья", 20);
        Student student3 = new Student("Николай", 19);
        Student student4 = new Student("Роман", 19);

        // System.out.println(student1);
        // System.out.println(student2);
        // System.out.println(student3);

        //Создаем список и добавляем в него студентов
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);

        //Создаем объект класса StudentGroup
        StudentGroup group1 = new StudentGroup(list, 1);
        //Перебираем группу студентов foreach и выводим информацию по каждому студенту в группе 
        for (Student student: group1) {
            System.out.println(student);
        }
        
        //Сортируем студентов в группе
        Collections.sort(group1.getStudentList());

        System.out.println("//////////////Сортируем//////////////");

        //Перебираем группу студентов foreach и выводим информацию по каждому студенту в группе 
        for (Student student: group1) {
            System.out.println(student);
        }
    }
}
