public class UserRegistration {
    private int idUser;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String login;
    private int idInstitute;
    private int idDepartment;
    private int idJob;

    public UserRegistration(int idUser, String firstName, String lastName, String gender, String email, String login, int idInstitute, int idDepartment, int idJob) {
        this.idUser = idUser;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.login = login;
        this.idInstitute = idInstitute;
        this.idDepartment = idDepartment;
        this.idJob = idJob;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getIdInstitute() {
        return idInstitute;
    }

    public void setIdInstitute(int idInstitute) {
        this.idInstitute = idInstitute;
    }

    public int getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(int idDepartment) {
        this.idDepartment = idDepartment;
    }

    public int getIdJob() {
        return idJob;
    }

    public void setIdJob(int idJob) {
        this.idJob = idJob;
    }
}
