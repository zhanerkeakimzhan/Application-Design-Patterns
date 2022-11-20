public class Doctoral extends Types{
    TypeOfTeachers typeOfTeachers;
    public Doctoral(TypeOfTeachers typeOfTeachers){
        this.typeOfTeachers = typeOfTeachers;
    }
    @Override
    public String getType() {
        return typeOfTeachers.getType() + ", докторант";
    }
}