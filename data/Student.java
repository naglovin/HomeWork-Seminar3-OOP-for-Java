// Модифицировать класс студент, заставив его реализовать интерфейс Comparable
// реализовать контракт compareTo() со сравнением по году рождения студента
// модифицировать класс StudentGroupServiceImpl, добавив в него метод сортировки списка студентов

package data;

public class Student extends User implements Comparable<Student> {
    private int grupNumber;

    public Student(String fio, int age, int passport, int grupNumber){
        super(fio, age, passport);
        this.grupNumber = grupNumber;

    }

    public int getGrupNumber() {
        return grupNumber;
    }

    public void int compareTo(Student student){
        if (student.getYearOfBirth() < this.getYearOfBirth()) return 1;
        if (student.getYearOfBirth() > this.getYearOfBirth()) return -1;
        return 0;
    }
}
