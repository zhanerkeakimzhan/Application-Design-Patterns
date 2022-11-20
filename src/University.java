import java.util.List;

public class University {
    private Student student;
    private Teacher teacher;
    private Commission commission;
    private Secretary secretary;
    private List<Student> students;
    private List<Teacher> teachers;

    public University(List<Student> students){
        this.students = students;
    }



    public List<Student> getStudents() {
        return students;
    }

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
    }
}