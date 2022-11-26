public class Diploma {
    private Day day;
    private String time;
    private String studentName;
    private cms commission_1;
    private cms commission_2;
    private cms commission_3;
    private Secretaries secretary;

    public void setDay(Day day) {
        this.day = day;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setCommission_1(cms commission_1) {
        this.commission_1 = commission_1;
    }

    public void setCommission_2(cms commission_2) {
        this.commission_2 = commission_2;
    }

    public void setCommission_3(cms commission_3) {
        this.commission_3 = commission_3;
    }

    public void setSecretary(Secretaries secretary) {
        this.secretary = secretary;
    }

    @Override
    public String toString() {
        return "Diploma[" +
                "day = " + day + "\n" +
                "time = " + time + "\n" +
                "student name = " + studentName + "\n" +
                "commission 1 = " + commission_1 + "\n" +
                "commission 2 = " + commission_2 + "\n" +
                "commission 3 = " + commission_3 + "\n" +
                "secretary = " + secretary + ']';
    }
}