import java.util.ArrayList;
import java.util.List;

import Controller.ControllerClass;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClass;
import Model.Domain.Student;
import View.ViewClass;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Экземпляры класса Student

        Student student1 = new Student("Максим", 20);
        Student student2 = new Student("Света", 21);
        Student student3 = new Student("Настя", 22);
        Student student4 = new Student("Сергей", 22);
        Student student5 = new Student("Александр", 20);
        Student student6 = new Student("Виктор", 23);
        Student student7 = new Student("Елена", 19);
        Student student8 = new Student("Виктория", 20);
        Student student9 = new Student("Николай", 21);
        Student student10 = new Student("Евгений", 24);


        //Заполнение списка студентов

        List <Student> studList = new ArrayList<>();
        studList.add(student1);
        studList.add(student2);
        studList.add(student3);
        studList.add(student4);
        studList.add(student5);
        studList.add(student6);
        studList.add(student7);
        studList.add(student8);
        studList.add(student9);
        studList.add(student10);

        // Создаем экземпляр класса ModelClass, передаем в него список студентов

        iGetModel model = new ModelClass(studList);

        // Создаем экземпляр класса ViewClass

        iGetView view = new ViewClass();

        // Создаем экземпляр класса ControllerClass, передаем model и view
        ControllerClass controller = new ControllerClass(model, view);


        //Вызываем метод run
        controller.run();

    }
}
