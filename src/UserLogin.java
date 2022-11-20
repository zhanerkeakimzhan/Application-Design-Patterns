public class UserLogin extends UserRegistration{
    private String userName;
    private int password;

    public UserLogin(int idUser, String firstName, String lastName, String gender, String email, String login, Institute idInstitute, Department idDepartment, int idJob, String userName, int password) {
        super(idUser, firstName, lastName, gender, email, login, idInstitute, idDepartment, idJob);
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "userName='" + userName + '\'' +
                ", password=" + password +
                '}';
    }
}
