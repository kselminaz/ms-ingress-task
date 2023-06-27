package solid.L;

public class SeminarTeacher implements Teacher {

    private String name;
    private int seminarHours;
    public SeminarTeacher(String name,int seminarHours){
        this.seminarHours=seminarHours;
        this.name=name;
    }
    @Override
    public int calculateHours() {
        return this.seminarHours;
    }
}
