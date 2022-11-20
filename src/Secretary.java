public class Secretary {
    private String secretaryName;
    private Student idStudent;
    private Teacher idTeacher;
    private Commission idCommission;

    public Secretary(String secretaryName, Student idStudent, Teacher idTeacher, Commission idCommission) {
        this.secretaryName = secretaryName;
        this.idStudent = idStudent;
        this.idTeacher = idTeacher;
        this.idCommission = idCommission;
    }

    public String getSecretaryName() {
        return secretaryName;
    }

    public void setSecretaryName(String secretaryName) {
        this.secretaryName = secretaryName;
    }

    public Student getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Student idStudent) {
        this.idStudent = idStudent;
    }

    public Teacher getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(Teacher idTeacher) {
        this.idTeacher = idTeacher;
    }

    public Commission getIdCommission() {
        return idCommission;
    }

    public void setIdCommission(Commission idCommission) {
        this.idCommission = idCommission;
    }

    @Override
    public String toString() {
        return "Secretary{" +
                "secretaryName='" + secretaryName + '\'' +
                ", idStudent=" + idStudent +
                ", idTeacher=" + idTeacher +
                ", idCommission=" + idCommission +
                '}';
    }
}
