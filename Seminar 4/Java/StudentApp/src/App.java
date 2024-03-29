import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controlers.AccountController;
import Domain.Employe;
import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentSteam;
import Domain.Teacher;
import Services.EmployeService;
import Services.StudentService;
import Services.TeacherService;

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

        Teacher t1 = new Teacher("Сергей", 45, "доцент");
        Employe e1 = new Employe("Игорь", 30, "дворник");

        AccountController controller = new AccountController();
        controller.paySalary(t1, 50000);
        controller.paySalary(e1, 35000);
        

        //Создаем объекты классов-сервисов и используя метод create наполняем списки новыми сотрудниками/студентами

        StudentService gr = new StudentService();
        gr.create("Сергей", 20);
        gr.create("Анна", 19);
        gr.create("Максим", 22);
        gr.create("Николай", 25);

        EmployeService em = new EmployeService();
        em.create("Александр", 50);
        em.create("Светлана", 35);
        em.create("Анастасия", 40);

        TeacherService tch = new TeacherService();
        tch.create("Олег", 47);
        tch.create("Елена", 38);
        tch.create("Сергей", 35);

        //Создаем экземпляр класса AccountController

        AccountController contr = new AccountController();

        //Выводим списки студентов/работников со средним возрастом.

        System.out.println("Студенты: \n" + gr.getAll() + '\n' + "Средний возраст студентов: " + contr.averageAge(gr.getAll()) + '\n' + "Работники: \n" + em.getAll() + '\n' + "Средний возраст работников: " + contr.averageAge(em.getAll()) + '\n' + "Преподователи: \n" + tch.getAll() + '\n' + "Средний возраст преподавателей: " + contr.averageAge(tch.getAll()) + '\n');

    }
    
}
