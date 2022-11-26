public class TuesdayDiploma extends DiplomaBuilder{
    @Override
    void buildDay() {
        diploma.setDay(Day.Tuesday);
    }

    @Override
    void buildTime() {
        diploma.setTime("8:00 - 8:30");
    }

    @Override
    void buildStudentName() {
        diploma.setStudentName("Jane");
    }

    @Override
    void buildCommission1() {
        diploma.setCommission_1(cms.Mukazhanov);
    }

    @Override
    void buildCommission2() {
        diploma.setCommission_2(cms.Kasenkhan);
    }

    @Override
    void buildCommission3() {
        diploma.setCommission_3(cms.Yerimbetova);
    }

    @Override
    void buildSecretary() {
        diploma.setSecretary(Secretaries.Iglikova);
    }
}
