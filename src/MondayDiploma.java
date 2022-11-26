public class MondayDiploma extends DiplomaBuilder{
    @Override
    void buildDay() {
        diploma.setDay(Day.Monday);
    }

    @Override
    void buildTime() {
        diploma.setTime("8:00 - 8:30");
    }

    @Override
    void buildStudentName() {
        diploma.setStudentName("Ann");
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
        diploma.setCommission_3(cms.Kabylzhan);
    }

    @Override
    void buildSecretary() {
        diploma.setSecretary(Secretaries.Aubakirov);
    }
}
