public abstract class DiplomaBuilder {
    Diploma diploma;

    void createDiploma(){
        diploma = new Diploma();
    }

    abstract void buildDay();
    abstract void buildTime();
    abstract void buildStudentName();
    abstract void buildCommission1();
    abstract void buildCommission2();
    abstract void buildCommission3();
    abstract void buildSecretary();

    Diploma getDiploma() {
        return diploma;
    }
}
