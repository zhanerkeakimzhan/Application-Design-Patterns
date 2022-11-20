public class Department {
    private int idDepartment;
    private String departmentName;
    private Institute idInstitute;

    public Department(int idDepartment, String departmentName, Institute idInstitute) {
        this.idDepartment = idDepartment;
        this.departmentName = departmentName;
        this.idInstitute = idInstitute;
    }

    public int getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(int idDepartment) {
        this.idDepartment = idDepartment;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Institute getIdInstitute() {
        return idInstitute;
    }

    public void setIdInstitute(Institute idInstitute) {
        this.idInstitute = idInstitute;
    }

    @Override
    public String toString() {
        return "Department{" +
                "idDepartment=" + idDepartment +
                ", departmentName='" + departmentName + '\'' +
                ", idInstitute=" + idInstitute +
                '}';
    }
}
