package POJO;

public class NonTeachingStaff extends Employee {
    private String role;
    public String getRole() {
        return role;
    }

    public void workHour(){
        System.out.println("Employee work 6 hour this NonTeacher class");

    }

    public void setRole(String role) {
        this.role = role;
    }

}
