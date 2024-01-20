package Services;

import java.util.ArrayList;
import java.util.List;

import Domain.PersonComparator;
import Domain.Teacher;

public class TeacherService implements iPersonService<Teacher>{
    private int count;
    private List<Teacher> teachers;
    public TeacherService() {
        teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }
    @Override
    public void create(String name, int age) {
        Teacher teach = new Teacher(name, age, "доцент");
        count++;
        teachers.add(teach);
    }
    public void sortByFio() {
        PersonComparator<Teacher> teachComp = new PersonComparator<>();
        teachers.sort(teachComp);
    }
}
