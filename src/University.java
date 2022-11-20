import java.util.List;

public class University {
    private List<Student> students;
    private List<Teacher> teachers;
    private List<Commission> commissions;
    private List<Secretary> secretaries;

    public University(List<Student> students, List<Teacher> teachers, List<Commission> commissions, List<Secretary> secretaries) {
        this.students = students;
        this.teachers = teachers;
        this.commissions = commissions;
        this.secretaries = secretaries;
    }

    public University(List<Student> students){
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Commission> getCommissions() {
        return commissions;
    }

    public void setCommissions(List<Commission> commissions) {
        this.commissions = commissions;
    }

    public List<Secretary> getSecretaries() {
        return secretaries;
    }

    public void setSecretaries(List<Secretary> secretaries) {
        this.secretaries = secretaries;
    }

    public List<Student> getStudents() {
        return students;
    }

<<<<<<< HEAD
    public void addStudent(String student) {

    }

    @Override
    public String toString() {
        return "University{" +
                "student=" + student +
                ", teacher=" + teacher +
                ", commission=" + commission +
                ", secretary=" + secretary +
                '}';
=======
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("{");
        for (Student aStudent : students){
            sb.append(aStudent.toString());
        }
        sb.append("}");
        return sb.toString();
>>>>>>> bda855d890effca9791f87766797c0b6c8b2d5fa
    }
}