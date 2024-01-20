package Domain;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<StudentGroup>{
    //Поля
    //Переменная которая следит, в каком месте метода мы находимся
    private int count;
    //Список групп
    private List<StudentGroup> list;

    //Конструктор
    public StudentGroupIterator(List<StudentGroup> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return count < list.size();
    }

    @Override
    public StudentGroup next() {
        // TODO Auto-generated method stub
       return list.get(count++);
    }

    
}
