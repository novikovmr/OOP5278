package Services;

import java.util.ArrayList;
import java.util.List;

import Domain.Employe;
import Domain.PersonComparator;

public class EmployeService implements iPersonService<Employe>{
    private int count;
    private List<Employe> employees;
    public EmployeService() {
        employees = new ArrayList<>();
    }
    @Override
    public List<Employe> getAll() {
        // TODO Auto-generated method stub
        return employees;
    }
    @Override
    public void create(String name, int age) {
        Employe emp = new Employe(name, age, "разнорабочий");
        count++;
        employees.add(emp);
    }
    
    public void sortByFio() {
        PersonComparator<Employe> empCom = new PersonComparator<>();
        employees.sort(empCom);
    }
}
