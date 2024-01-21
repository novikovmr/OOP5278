package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

public class ModelClassHash implements iGetModel{
    // List<Student> students = new ArrayList<>();
    HashMap<Integer, Student> studentsHash;
    
    
    public ModelClassHash(HashMap<Integer, Student> studentsHash) {
        this.studentsHash = studentsHash;
    }

    public void deleteStudent(int removeNumb) {
        if (studentsHash.containsKey(removeNumb)) {
            studentsHash.remove(removeNumb);
        }
        else {
            System.out.println("Такого номера нет");
        }
    }

    @Override
    public List<Student> getStudents() {
        
        return new ArrayList<>(studentsHash.values());
    }

}

