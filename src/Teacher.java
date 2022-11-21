public class Teacher extends TypeOfTeachers{
    private int teacherId;
    private String name;
    public Teacher(){
        type = "Преподаватель";
    }

    public Teacher(int teacherId, String name) {
        this.teacherId = teacherId;
        this.name = name;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getType() {
        return type;
    }
    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
