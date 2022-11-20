public class Teacher extends TypeOfTeachers{
    private String teacherId;
    private Student studentId;

    private final String type;
    public Teacher(){
        type = "Преподаватель";
    }

    public Teacher(String teacherId, Student studentId, String type) {
        this.teacherId = teacherId;
        this.studentId = studentId;
        this.type = type;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public Student getStudentId() {
        return studentId;
    }

    public void setStudentId(Student studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId + '\'' +
                ", studentId=" + studentId +
                ", type='" + type + '\'' +
                '}';
    }
}
