package service;

import data.StudentGroup;
import data.User;

public interface DataService {
    void create(User user);
    User read(User user);

    StudentGroup getGroup(int groupNumber);
}
