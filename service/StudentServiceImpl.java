package service;

import Util.ReaderFromTxt;
import Util.WriteToTxt;
import data.User;

import java.io.Reader;

public class StudentServiceImpl implements DataService{

    @Override
    public void create(User user) {
        WriteToTxt.write(user);
    }

    @Override
    public User read(User user) {

       return ReaderFromTxt.read(user);
    }
}
