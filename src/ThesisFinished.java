public class ThesisFinished extends State{
    Student student;
    public ThesisFinished(Student student) {
        super(student);
    }
    @Override
    public String chooseTitle() {
        student.changeState(new TitleSelected(student));
        return "Тема дипломной работы выбран";
    }
    @Override
    public String finishThesis() {
        String action = student.finishThesis();
        student.changeState(new ThesisDefended(student));
        return action;
    }

    @Override
    public String defendThesis() {
        return "Тема дипломной работы выбран";
    }

    @Override
    public String getDiploma() {
        return "Тема дипломной работы выбран";
    }
}
