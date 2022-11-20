public class Teacher {
    private String teacherName;
    private int idStudent;

    public Teacher(String teacherName, int idStudent) {
        this.teacherName = teacherName;
        this.idStudent = idStudent;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }
}
