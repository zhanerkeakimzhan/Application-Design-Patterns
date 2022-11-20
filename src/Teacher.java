public class Teacher {
    private int idTeacher;
    private String teacherName;
    private Student idStudent;

    public Teacher(int idTeacher, String teacherName, Student idStudent) {
        this.idTeacher = idTeacher;
        this.teacherName = teacherName;
        this.idStudent = idStudent;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Student getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Student idStudent) {
        this.idStudent = idStudent;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "idTeacher=" + idTeacher +
                ", teacherName='" + teacherName + '\'' +
                ", idStudent=" + idStudent +
                '}';
    }
}
