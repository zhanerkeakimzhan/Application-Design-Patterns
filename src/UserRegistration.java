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

}
