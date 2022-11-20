public class Commission {
<<<<<<< HEAD
    private int iDCommission;
    private String name;
    private String lastname;
    private String contacts;

    public Commission(int iDCommission, String name, String lastname, String contacts) {
        this.iDCommission = iDCommission;
        this.name = name;
        this.lastname = lastname;
        this.contacts = contacts;
    }
    public int getiDCommission() {
        return iDCommission;
    }
    public void setiDCommission(int iDCommission) {
        this.iDCommission = iDCommission;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getContacts() {
        return contacts;
    }
    public void setContacts(String contacts) {
        this.contacts = contacts;
    }
}
=======
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
>>>>>>> 4227cab265922882842d858c5e9d1276e49065a2
