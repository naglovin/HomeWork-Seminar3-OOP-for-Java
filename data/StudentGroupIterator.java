//- Создать класс StudentGroupIterator, заставив его реализовать интерфейс Iterator<Student>
//        - Реализовать его абстрактные методы
//        - Реализовать метод remove()


package data;

import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {
    private StudentGroup studentGroup;
    private Iterator<Student> students;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
        this.students = studentGroup.getStudents().iterator();

    }
    @Override
    public boolean hasNext(){
        return this.students.hasNext();
    }
    @Override
    public Student next(){
        return this.students.next();
    }
    @Override
    public void remove(){
        this.students.remove();
    }
}

