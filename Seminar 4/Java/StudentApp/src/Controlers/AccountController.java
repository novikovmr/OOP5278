package Controlers;

import Domain.Person;

public class AccountController {
    public <T extends Person, V> void paySalary(T person, V salar) 
    {
        System.out.println(person.getName() + " зарплата: " + salar);
    }
}
