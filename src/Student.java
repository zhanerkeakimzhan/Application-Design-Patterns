public class Student {
    private int studentId;
    private String studentName;
    private State state;
    private boolean diplomaTitle = false;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.state = new TitleSelected(this);
    }

    public Student(){
        this.state = new TitleSelected(this);
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

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public boolean isDiplomaTitle() {
        return diplomaTitle;
    }

    public void setDiplomaTitle(boolean diplomaTitle) {
        this.diplomaTitle = diplomaTitle;
    }

    public void changeState(State state){
        this.state = state;
    }

    public String finishThesis(){
        return "Thesis finished";
    }

    public String defendThesis(){
        return "Thesis defended";
    }

    public String getDiploma(){
        return "Diploma got";
    }


    @Override
    public String toString() {
        return "Student[student Id = " + studentId +
                ", student Name = '" + studentName + '\'' +
                ", state = " + state + "]\n";
    }
}
