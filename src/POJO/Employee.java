package POJO;

public class Employee extends School{
    private  Integer emploeeId;
    private String employeeName;

    public void workHour(){
        System.out.println("Employee work 6 hour this employe class");

    }
    public Integer getEmploeeId() {
        return emploeeId;
    }

    public void setEmploeeId(Integer emploeeId) {
        this.emploeeId = emploeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
