package Domain;

import java.util.Iterator;
import java.util.List;

public class StudentIterator implements Iterator<Student> {
    //Поля
    //Счетчик, чтобы следить, где мы сейчас находимся
    private int count;
    //Коллекция (объект итераций)
    private List<Student> list;


    public StudentIterator(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return count < list.size();
    }

    @Override 
    public Student next() {
        // TODO Auto-generated method stub
        return list.get(count++);
    }
    
}
