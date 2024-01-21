import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.ControllerClass;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClass;
import Model.ModelClassHash;
import Model.Domain.Student;
import View.ViewClass;
import View.ViewClassEng;

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

        //Создаем мапу и заполняем ее студентами

        HashMap<Integer, Student> studHash = new HashMap<>();
        studHash.put(1, student1);
        studHash.put(2, student2);
        studHash.put(3, student3);
        studHash.put(4, student4);
        studHash.put(5, student5);
        studHash.put(6, student6);
        studHash.put(7, student7);
        studHash.put(8, student8);

        // Создаем экземпляр класса ModelClass, передаем в него список студентов

        iGetModel model = new ModelClass(studList);
        iGetModel modelHash = new ModelClassHash(studHash);

        // Создаем экземпляр класса ViewClass

        iGetView view = new ViewClass();
        iGetView viewEng = new ViewClassEng();

        // Создаем экземпляр класса ControllerClass, передаем model и view
        ControllerClass controller = new ControllerClass(modelHash, viewEng);


        //Вызываем метод run
        controller.run();

    }
}
