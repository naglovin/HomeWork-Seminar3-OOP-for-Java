// класс GroupStreamComparator<GroupStream>, реализующий сравнение количества групп входящих в GroupStream

package Comparator;

import data.GroupStream;
import data.Student;

import java.util.Comparator;

public class GroupStreamComparator implements Comparator<GroupStream> {
    @Override
    public int compare (GroupStream groupStream1, GroupStream groupStream2){
        int GroupStream1 = groupStream1.getStudentGroup().size();
        int GroupStream2 = groupStream2.getStudentGroup().size();
        return Integer.compare(GroupStream1, GroupStream2);
    }
}
