public class UserRegistration extends UserLogin{
    private int idUser;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String login;
    private Institute idInstitute;
    private Department idDepartment;
    private int idJob;

    public UserRegistration(String userName, int password, int idUser, String firstName, String lastName, String gender, String email, String login, Institute idInstitute, Department idDepartment, int idJob) {
        super(userName, password);
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

    public Institute getIdInstitute() {
        return idInstitute;
    }

    public void setIdInstitute(Institute idInstitute) {
        this.idInstitute = idInstitute;
    }

    public Department getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(Department idDepartment) {
        this.idDepartment = idDepartment;
    }

    public int getIdJob() {
        return idJob;
    }

    public void setIdJob(int idJob) {
        this.idJob = idJob;
    }

    @Override
    public String toString() {
        return "UserRegistration{" +
                "idUser=" + idUser +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", idInstitute=" + idInstitute +
                ", idDepartment=" + idDepartment +
                ", idJob=" + idJob +
                '}';
    }
}
