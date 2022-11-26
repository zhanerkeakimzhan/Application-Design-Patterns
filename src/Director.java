public class Director {
    DiplomaBuilder builder;

    public void setBuilder(DiplomaBuilder builder) {
        this.builder = builder;
    }

    Diploma buildDiploma(){
        builder.createDiploma();
        builder.buildDay();
        builder.buildTime();
        builder.buildStudentName();
        builder.buildCommission1();
        builder.buildCommission2();
        builder.buildCommission3();
        builder.buildSecretary();

        Diploma diploma = builder.getDiploma();
        return diploma;
    }
}
