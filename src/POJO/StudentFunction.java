package POJO;

public class StudentFunction {
    private Integer studentId;
    private String studentName;
    private  String grade;
    private String assignTeacherName;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        if(studentId>100)
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {

        this.studentName = studentName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAssignTeacherName() {
        return assignTeacherName;
    }

    public void setAssignTeacherName(String assignTeacherName) {
        this.assignTeacherName = assignTeacherName;
    }
}
