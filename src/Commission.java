public class Commission {
    private String commissionName;
    private int idStudent;
    private int idTeacher;

    public Commission(String commissionName, int idStudent, int idTeacher) {
        this.commissionName = commissionName;
        this.idStudent = idStudent;
        this.idTeacher = idTeacher;
    }

    public String getCommissionName() {
        return commissionName;
    }

    public void setCommissionName(String commissionName) {
        this.commissionName = commissionName;
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
}
