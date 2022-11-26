public class FridayDiploma extends DiplomaBuilder{
    @Override
    void buildDay() {
        diploma.setDay(Day.Friday);
    }

    @Override
    void buildTime() {
        diploma.setTime("13:55 - 14:25");
    }

    @Override
    void buildStudentName() {
        diploma.setStudentName("Milli");
    }

    @Override
    void buildCommission1() {
        diploma.setCommission_1(cms.Yerimbetova);
    }

    @Override
    void buildCommission2() {
        diploma.setCommission_2(cms.Baymbetov);
    }

    @Override
    void buildCommission3() {
        diploma.setCommission_3(cms.Mukazhanov);
    }

    @Override
    void buildSecretary() {
        diploma.setSecretary(Secretaries.Imamatdinova);
    }
}
