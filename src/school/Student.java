package school;

public class Student {
    public Integer studentId;
    public String studentName;
    public Teacher getTeacher(){
        Teacher teacher = new Teacher();
        teacher.teacherName="John";
        return  teacher;

    }
}
