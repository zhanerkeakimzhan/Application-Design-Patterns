public class Student {
    private int studentId;
    private String studentName;
    private String diplomaTitle;

    public Student(int studentId, String studentName, String diplomaTitle) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.diplomaTitle = diplomaTitle;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDiplomaTitle() {
        return diplomaTitle;
    }

    public void setDiplomaTitle(String diplomaTitle) {
        this.diplomaTitle = diplomaTitle;
    }


}
