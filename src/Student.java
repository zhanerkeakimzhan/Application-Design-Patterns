public class Student {
    private int idStudent;
    private String studName;
    private String diplomaTitle;
    private double score;

    public Student(int idStudent, String studName, String diplomaTitle, double score) {
        this.idStudent = idStudent;
        this.studName = studName;
        this.diplomaTitle = diplomaTitle;
        this.score = score;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getDiplomaTitle() {
        return diplomaTitle;
    }

    public void setDiplomaTitle(String diplomaTitle) {
        this.diplomaTitle = diplomaTitle;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String showDiploma() {
        return diplomaTitle;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", studName='" + studName + '\'' +
                ", diplomaTitle='" + diplomaTitle + '\'' +
                ", score=" + score +
                '}';
    }
}
