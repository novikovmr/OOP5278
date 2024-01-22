package Task1;

import java.sql.Date;

public class Employee {
   
    private String name;
    private Date dob;

    /**
     * 
     * @param name - Имя работника
     * @param dob - Дата рождения работника
     */

    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
    }

    /**
     * 
     * @return - Возвращаем информацию о работнике в формате Имя + дата рождения
     */
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

}
