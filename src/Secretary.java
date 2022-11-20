public class Secretary {
    private String secretaryName;
    private int idStudent;
    private int idTeacher;
    private int idCommission;

    public Secretary(String secretaryName, int idStudent, int idTeacher, int idCommission) {
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

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    public int getIdCommission() {
        return idCommission;
    }

    public void setIdCommission(int idCommission) {
        this.idCommission = idCommission;
    }
}
