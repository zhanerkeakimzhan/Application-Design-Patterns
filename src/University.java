public class University {
    private Student student;
    private Teacher teacher;
    private Commission commission;
    private Secretary secretary;

    public University(Student student, Teacher teacher, Commission commission, Secretary secretary) {
        this.student = student;
        this.teacher = teacher;
        this.commission = commission;
        this.secretary = secretary;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Commission getCommission() {
        return commission;
    }

    public void setCommission(Commission commission) {
        this.commission = commission;
    }

    public Secretary getSecretary() {
        return secretary;
    }

    public void setSecretary(Secretary secretary) {
        this.secretary = secretary;
    }

}