//Модифицировать класс StudentGroupServiceImpl, добавив в него метод удаления студента по ФИО
//        - Модифицировать класс Controller, добавив в него метод удаления студента и вызывать в нем созданный метод из StudentGroupServiceImpl
package service;

import data.Student;
import data.StudentGroup;
import data.User;

import java.util.Collection;
import java.util.Iterator;

import static java.util.Collection.*;

public class StudentGroupServiceImpl {
    @Override
    public void create(User user){
    }
    @Override
    public StudentGroup getGroup(){

        return new StudentGroup(getTaacherFromTxt(), getStudentFromTxt());
    }
    @Override
    public StudentGroup getGroup(int number){
        return new StudentGroup(getTaacherFromTxt(), getStudentFromTxt(), number);
    }

    @Override
    public void remove(Student fio){
        Iterator<Student> studentGroup = getGroup().iterator();
        while (studentGroup.hasNext()){
            Student student = studentGroup.next();
            if(fio.equals(student.getFio())){
                studentGroup.remove();
            }
        }
        this.remove();
    }
    public void sortStudents(StudentGroup studentGroup){
        Collection.sort(studentGroup.getStudents());
    }
}
