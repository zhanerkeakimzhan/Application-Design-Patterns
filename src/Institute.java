public class Institute {
    private int idInstitute;
    private String instituteName;

    public Institute(int idInstitute, String instituteName) {
        this.idInstitute = idInstitute;
        this.instituteName = instituteName;
    }

    public int getIdInstitute() {
        return idInstitute;
    }

    public void setIdInstitute(int idInstitute) {
        this.idInstitute = idInstitute;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    @Override
    public String toString() {
        return "Institute{" +
                "idInstitute=" + idInstitute +
                ", instituteName='" + instituteName + '\'' +
                '}';
    }
}
