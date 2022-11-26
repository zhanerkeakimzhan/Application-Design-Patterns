public class WednesdayDiploma extends DiplomaBuilder{
    @Override
    void buildDay() {
        diploma.setDay(Day.Wednesday);
    }

    @Override
    void buildTime() {
        diploma.setTime("11:15 - 11:45");
    }

    @Override
    void buildStudentName() {
        diploma.setStudentName("Jeon");
    }

    @Override
    void buildCommission1() {
        diploma.setCommission_1(cms.Yerimbetova);
    }

    @Override
    void buildCommission2() {
        diploma.setCommission_2(cms.Kabylzhan);
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
