//Создать класс GroupStream, содержащий в себе список StudentGroup и реализующий интерфейс Iterable<StudentGroup>



package data;

import java.util.Iterator;
import java.util.List;

public class GroupStream implements Iterable<StudentGroup{
    private List<StudentGroup> studentGroup;

    public GroupStream(List<StudentGroup> studentGroup) {
        this.studentGroup = studentGroup;
    }

    public void setStudentGroup(List<StudentGroup> studentGroup) {
        this.studentGroup = studentGroup;
    }

    public List<StudentGroup> getStudentGroup() {
        return studentGroup;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return null;
    }
}
