package controller;

import data.GroupStream;
import data.StudentGroup;
import service.DataService;
import service.GroupStreamService;
import service.StudentServiceImpl;
import data.Student;

import java.util.List;

public class Controller {
    private DataService studentService;
    private  DataService groupService;
    private  GroupStreamService groupStreamService;
    public Controller(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }
    public Student createStudent(Student student){
        studentService.create(student);
        return (Student) studentService.read(student);
    }
    public Controller(DataService groupService, GroupStreamService groupStreamService) {
        this.groupService = groupService;
        this.groupStreamService = groupStreamService;
    }

    public StudentGroup createGroup(int groupNumber) {
        return groupService.getGroup(groupNumber);
    }

    public void streamListSort(List<GroupStream> groupStream) {
        groupStreamService.streamSort(groupStream);
    }

}
