//Создать класс UserComparator ркализующий интерфейс. реализовать компаратор юзер.


package Comparator;

import data.Student;

import java.util.Comparator;

public class UserComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2){
        return (student1.getFio().compareTo(student2.getFio()));
    }
}
