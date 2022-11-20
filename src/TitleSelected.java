public class TitleSelected extends State{
    public TitleSelected(Student student) {
        super(student);
        student.setDiplomaTitle(false);
    }
    @Override
    public String chooseTitle() {
        if (student.isDiplomaTitle()){
            student.changeState(new ThesisFinished(student));
            return "Выбор темы дипломной работы";
        }else return "Тема дипломной работы выбран";
    }
    @Override
    public String finishThesis() {
        student.changeState(new ThesisFinished(student));
        return "Дипломная работа закочен";
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
