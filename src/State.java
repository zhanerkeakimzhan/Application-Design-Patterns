public abstract class State {
    protected Student student;
    public State(Student student) {
        this.student = student;
    }

    public abstract String chooseTitle();
    public abstract String finishThesis();
    public abstract String defendThesis();
    public abstract String getDiploma();
}
