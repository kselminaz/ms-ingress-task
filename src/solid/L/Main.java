package solid.L;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Teacher> teachers=new ArrayList<>();
        teachers.add(new SeminarTeacher("test Seminar",60));
        teachers.add(new Lecturer("test Lecturer",30,6));
        teachers.stream().forEach(t-> System.out.println(t.calculateHours()));
    }
}
