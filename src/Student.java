public class Student {
    private int studentId;
    private String studentName;
    private State state;
    private boolean diplomatitle = false;
    public Student(int studentId, String studentName, State state, boolean diplomatitle) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.state = new TitleSelected(this);
        this.diplomatitle = false;
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

    public boolean isDiplomatitle() {
        return diplomatitle;
    }

    public void setDiplomatitle(boolean diplomatitle) {
        this.diplomatitle = diplomatitle;
    }

    public void changeState(State state){
        this.state = state;
    }
    public String finishThesis(){
        return "Thesis finished";
    };
    public String defendThesis(){
        return "Thesis defended";
    };
    public String getDiploma(){
        return "Diploma got";
    };
}
