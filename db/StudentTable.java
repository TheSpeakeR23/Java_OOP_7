package db;

import data.user.Student;

public class StudentTable extends Table<Student> {

    public boolean deleteByFio(String fio) {
        int count = 0;
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getFio().equals(fio)) {
                elements.remove(elements.get(i));
                count++;
                i--;
            }
        }
        for (Student student : elements) {
        }
        if (count > 0) return true;
        else return false;
    }
}