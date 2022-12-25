package view;

import data.User;

import java.util.List;

public class StudentView extends UserView{

    @Override
    protected User findTheBest(List<User> userList) {
        // логика для нахождения лучшего ученика
        return null;
    }
}
