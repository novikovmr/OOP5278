package Controlers;

import java.util.ArrayList;
import java.util.List;

import Domain.Person;
import Services.TeacherService;
import Services.iPersonService;
import Services.StudentService;
import Services.EmployeService;


public class AccountController {
    public <T extends Person, V> void paySalary(T person, V salar) 
    {
        System.out.println(person.getName() + " зарплата: " + salar);
    }

    public static <T extends Person> double averageAge(List<T> list) {
        double sum = 0;
        for (Person el : list) {
            sum += el.getAge();
        }
        return sum/list.size();
    }



}
