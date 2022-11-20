public class ThesisDefended extends State{
    public ThesisDefended(Student student){
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
        String action = student.defendThesis();
        student.changeState(new DiplomaGot(student));
        return action;
    }

    @Override
    public String getDiploma() {
        return "Тема дипломной работы выбран";
    }

}
