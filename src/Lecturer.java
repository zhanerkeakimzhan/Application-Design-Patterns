public class Lecturer extends Types{
    TypeOfTeachers typeOfTeachers;
    public Lecturer(TypeOfTeachers typeOfTeachers){
        this.typeOfTeachers = typeOfTeachers;
    }
    @Override
    public String getType() {
        return typeOfTeachers.getType() + ", лектор";
    }
}
