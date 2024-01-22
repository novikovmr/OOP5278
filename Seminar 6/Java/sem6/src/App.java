import java.sql.Date;

import javax.xml.crypto.Data;

import Task1.Accountant;
import Task1.Employee;
import Task2.Bus;
import Task2.Car;
import Task2.Vehicle;
import Task3.Circle;
import Task3.Cube;
import Task4.Rectangle;
import Task4.Square;
import Task5.Cars;

public class App {
    public static void main(String[] args) throws Exception {


        //Task1
        System.out.println("--------Task1----------");
        Employee em1 = new Employee("Alex",new Date(80, 10, 01), 10000);
        Accountant ac1 = new Accountant(10000);
        
        System.out.println(em1.getEmpInfo() + ", З/п после вычета налога: " + ac1.calculateNetSalary());

        //Task 2
        System.out.println("--------Task2----------");
        Vehicle vh1 = new Car(110, "Tesla");
        Vehicle vh2 = new Bus(80, "Gazel");
        System.out.println(vh1.calculateAllowedSpeed());
        System.out.println(vh2.calculateAllowedSpeed());


        //Task3
        System.out.println("--------Task3----------");
        Circle fig1 = new Circle(10);
        Cube fig2 = new Cube(3);

        System.out.println("Площадь круга: " + fig1.area());
        System.out.println("Площадь Куба: " + fig2.area() + ", Объем куба: " + fig2.volume());


        //Task4
        System.out.println("--------Task4----------");
        Square f1 = new Square(4);
        System.out.println("Площадь квадрата: " + f1.getArea());
        Rectangle f2 = new Rectangle(4, 2);
        System.out.println("Площадь квадрата: " + f2.getArea());

        //Task 5
        System.out.println("--------Task5----------");
        Cars volga = new Cars("Disel engine");
        volga.start();
        
    }
}
