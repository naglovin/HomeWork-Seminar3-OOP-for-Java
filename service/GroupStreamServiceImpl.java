//Создать класс GroupStreamServiceImpl,
// добавив в него метод сортировки списка потоков,
// используя созданный GroupStreamComparator

package service;

import Comparator.GroupStreamComparator;
import data.GroupStream;

import java.util.Collections;
import java.util.List;

public class GroupStreamServiceImpl extends GroupStreamComparator {
    @Override
    public void StreamSort (List<GroupStream> groupStream){
        Collections.sort(groupStream, new data.comparators.GroupStreamComparator());
    }
}
