public class Commission {
    private int idCommission;
    private String commissionName;
    private Student idStudent;
    private Teacher idTeacher;

    public Commission(int idCommission, String commissionName, Student idStudent, Teacher idTeacher) {
        this.idCommission = idCommission;
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

    public int getIdCommission() {
        return idCommission;
    }

    public void setIdCommission(int idCommission) {
        this.idCommission = idCommission;
    }

    @Override
    public String toString() {
        return "Commission{" +
                "idCommission=" + idCommission +
                ", commissionName='" + commissionName + '\'' +
                ", idStudent=" + idStudent +
                ", idTeacher=" + idTeacher +
                '}';
    }
}
