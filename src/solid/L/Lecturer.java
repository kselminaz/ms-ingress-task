package solid.L;

public class Lecturer implements Teacher{
    private String name;
    private int lectureHours;
    private int examHours;
    public Lecturer(String name,int lectureHours,int examHours){
        this.lectureHours=lectureHours;
        this.examHours=examHours;
        this.name=name;
    }
    @Override
    public int calculateHours() {
        return this.lectureHours+this.examHours;
    }
}
