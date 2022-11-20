public class Magist extends Types{
    TypeOfTeachers typeOfTeachers;
    public Magist(TypeOfTeachers typeOfTeachers){
        this.typeOfTeachers = typeOfTeachers;
    }
    @Override
    public String getType() {
        return typeOfTeachers.getType() + ", магистр";
    }
}
