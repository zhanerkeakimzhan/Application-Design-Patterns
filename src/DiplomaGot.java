public class DiplomaGot extends State{
    public DiplomaGot(Student student){
        super(student);
    }

    @Override
    public String chooseTitle() {
        student.changeState(new TitleSelected(student));
        return "Тема дипломной работы выбран";
    }

    @Override
    public String finishThesis() {
        student.changeState(new ThesisFinished(student));
        return "Дипломной работа готов!";
    }

    @Override
    public String defendThesis() {
        student.changeState(new ThesisDefended(student));
        return "Дипломной работа готов!";
    }

    @Override
    public String getDiploma() {
        return student.getDiploma();
    }
}
