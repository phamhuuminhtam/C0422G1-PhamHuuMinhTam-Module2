package ss05_accessmodifier_static.bai_tap.crud;

public class Student {
    private int rollno;
    private String name;
    private String address;
    private String email;
    private String classesd;
    private boolean gender;
    static String school = "Codegym";
    static int count=0;
    public Student() {
    }

    public Student(int rollno, String name, String address, String email, String classesd, boolean gender) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
        this.email = email;
        this.classesd = classesd;
        this.gender = gender;
        count++;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClassesd() {
        return classesd;
    }

    public void setClassesd(String classesd) {
        this.classesd = classesd;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", classesd='" + classesd + '\'' +
                ", gender=" + gender +
                '}';
    }
}
