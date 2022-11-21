public abstract class TypeOfTeachers {
    String type;
    Teacher teacher;
    public String getType(){
        return teacher.getName() + getType();
    }
}
