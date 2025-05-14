package POJO;

public class TeacherFunction extends Employee{

    private String teachingSubject;

//    private String teacherName;
//    private Integer teacherId;
public void workHour(){
    System.out.println("Employee work 6 hour this teacherFunction class");

}
    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }


//    public String getTeacherName() {
//        return teacherName;
//    }
//
//    public void setTeacherName(String teacherName) {
//        this.teacherName = teacherName;
//    }
//
//    public Integer getTeacherId() {
//        return teacherId;
//    }
//
//    public void setTeacherId(Integer teacherId) {
//        this.teacherId = teacherId;
//    }
}
