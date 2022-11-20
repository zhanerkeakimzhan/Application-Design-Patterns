public class Student {
    private String studName;
    private String diplomaTitle;
    private double score;

    public Student(String studName, String diplomaTitle, double score) {
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

    public String showDiploma() {
        return diplomaTitle;
    }
}
