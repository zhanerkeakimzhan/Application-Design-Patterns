public class Professor extends Types{
    TypeOfTeachers typeOfTeachers;
    public Professor(TypeOfTeachers typeOfTeachers){
        this.typeOfTeachers = typeOfTeachers;
    }
    @Override
    public String getType() {
        return typeOfTeachers.getType() + ", профессор";
    }
}