public class Secretary{
    private String secretaryName;
    private Student studentId;
    private Teacher teacherId;
    private Commission commissionId;
    private Document document;

    public Secretary(String secretaryName, Student studentId, Teacher teacherId, Commission commissionId, Document document) {
        this.secretaryName = secretaryName;
        this.studentId = studentId;
        this.teacherId = teacherId;
        this.commissionId = commissionId;
        this.document = document;
    }

    public String getSecretaryName() {
        return secretaryName;
    }

    public void setSecretaryName(String secretaryName) {
        this.secretaryName = secretaryName;
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

    public Commission getCommissionId() {
        return commissionId;
    }

    public void setCommissionId(Commission commissionId) {
        this.commissionId = commissionId;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    @Override
    public String toString() {
        return "Secretary{" +
                "secretaryName='" + secretaryName + '\'' +
                ", studentId=" + studentId +
                ", teacherId=" + teacherId +
                ", commissionId=" + commissionId +
                ", document=" + document +
                '}';
    }
}
