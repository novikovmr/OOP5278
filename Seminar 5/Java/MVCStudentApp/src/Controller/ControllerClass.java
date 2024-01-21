package Controller;

import java.util.ArrayList;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClass;
import Model.Domain.Student;
import View.ViewClass;

public class ControllerClass {

    private iGetModel model;
    private iGetView view;
    private List<Student> studBuffer = new ArrayList<>();

    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    
    private boolean testData(List<Student> stud) {
        if(stud.size() > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    
    public void update(String Request) {
        //MVP
        studBuffer = model.getStudents();
        if(testData(studBuffer)) {
            view.printAllStudent(studBuffer);
        }
        else {
            System.out.println("Список студентов пуст!");
        }

        //MVC
        // view.printAllStudent(model.getStudents());
    }

    public void run() {
        Command com = (Command)Command.NONE;
        boolean getNewIter = true;
        while(getNewIter){
            String command = view.prompt("Введите команду");
            com = Command.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIter = false;
                    System.out.println("Выход");
                    break;
                case LIST:
                    view.printAllStudent(model.getStudents());
                    break;
            }
        }
    }
}
