public class ThursdayDiploma extends DiplomaBuilder{
    @Override
    void buildDay() {
        diploma.setDay(Day.Thursday);
    }

    @Override
    void buildTime() {
        diploma.setTime("10:00 - 10:30");
    }

    @Override
    void buildStudentName() {
        diploma.setStudentName("Kai");
    }

    @Override
    void buildCommission1() {
        diploma.setCommission_1(cms.Alibieva);
    }

    @Override
    void buildCommission2() {
        diploma.setCommission_2(cms.Baymbetov);
    }

    @Override
    void buildCommission3() {
        diploma.setCommission_3(cms.Kasenkhan);
    }

    @Override
    void buildSecretary() {
        diploma.setSecretary(Secretaries.Aubakirov);
    }
}
