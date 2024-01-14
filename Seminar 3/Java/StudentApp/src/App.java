import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentSteam;

public class App {
    public static void main(String[] args) {

        //Создание экземпляров класса
        Student student5 = new Student("Анастасия", 19);
        Student student1 = new Student("Максим", 23);
        Student student6 = new Student("Сергей", 19);
        Student student2 = new Student("Дарья", 20);
        Student student3 = new Student("Николай", 19);
        Student student4 = new Student("Роман", 19);
        Student student7 = new Student("Светлана", 21);
        Student student8 = new Student("Александр", 24);
        Student student9 = new Student("Олег", 20);
        Student student10 = new Student("Виктория", 21);
        Student student11 = new Student("Евгений", 22);
        Student student12 = new Student("Марат", 19);


        // System.out.println(student1);
        // System.out.println(student2);
        // System.out.println(student3);

        //Создаем списки будущих групп студентов и добавляем в них студентов
        List<Student> list = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();
        List<Student> list3 = new ArrayList<>();

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list2.add(student4);
        list2.add(student5);
        list2.add(student6);
        list2.add(student7);
        list2.add(student8);
        list2.add(student9);
        list3.add(student10);
        list3.add(student11);
        list3.add(student12);
        
        //Создаем объекты класса StudentGroup
        StudentGroup group1 = new StudentGroup(list, 1);
        StudentGroup group2 = new StudentGroup(list2, 2);
        StudentGroup group3 = new StudentGroup(list3, 3);

        
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

        System.out.println("---------Студенческий поток---------------------");
        

        //Создаем списки будущих потоков, состоящие из студенческих групп 
        List<StudentGroup> studentGroupList = new ArrayList<>();
        studentGroupList.add(group1);
        studentGroupList.add(group2);
        studentGroupList.add(group3);
        
        //Создаем экземпляр класса StudentSteam
        StudentSteam steam1 = new StudentSteam(1, studentGroupList);
        
        for (StudentGroup group : steam1) {
            System.out.println(group);
        }

        System.out.println("-------Сортировка---------------------");

        //Сортировка
        Collections.sort(steam1.getGroup());

        //Перебираем студ. поток foreach
        for (StudentGroup group : steam1) {
            System.out.println(group);
        }

    }
    
}
