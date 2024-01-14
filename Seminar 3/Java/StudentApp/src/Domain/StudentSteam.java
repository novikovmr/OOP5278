package Domain;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup>{
    //Поле
    private int steamNo;

    private List<StudentGroup> group;

    public StudentSteam(int steamNo, List<StudentGroup> group) {
        this.steamNo = steamNo;
        this.group = group;
    }

    public int getSteamNo() {
        return steamNo;
    }

    public void setSteamNo(int steamNo) {
        this.steamNo = steamNo;
    }

    public List<StudentGroup> getGroup() {
        return group;
    }

    public void setGroup(List<StudentGroup> group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "StudentSteam No: " + steamNo + ", group: " + group + ";";
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        // TODO Auto-generated method stub
        return new StudentGroupIterator(group);
    }


    
    

}
