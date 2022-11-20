public class Commission {
    private int commissionId;
    private String commissionName;
    private Student studentId;
    private Teacher teacherId;

    public Commission(int commissionId, String commissionName, Student studentId, Teacher teacherId) {
        this.commissionId = commissionId;
        this.commissionName = commissionName;
        this.studentId = studentId;
        this.teacherId = teacherId;
    }

    public int getCommissionId() {
        return commissionId;
    }

    public void setCommissionId(int commissionId) {
        this.commissionId = commissionId;
    }

    public String getCommissionName() {
        return commissionName;
    }

    public void setCommissionName(String commissionName) {
        this.commissionName = commissionName;
    }

    public Student getStudentId() {
        return studentId;
    }

    public void setStudentId(Student studentId) {
        this.studentId = studentId;
    }

    public Teacher getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Teacher teacherId) {
        this.teacherId = teacherId;
    }
}
