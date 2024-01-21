package Controller.Interfaces;

import java.util.List;

import Model.Domain.Student;

public interface iGetModel {
    //Абстрактный метод на получение списка студентов
    public List<Student> getStudents();
    public void deleteStudent(int idStud);
    
} 
