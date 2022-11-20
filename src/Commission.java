public class Commission {
    private int iDCommission;
    private String name;
    private String lastname;
    private String contacts;

    public Commission(int iDCommission, String name, String lastname, String contacts) {
        this.iDCommission = iDCommission;
        this.name = name;
        this.lastname = lastname;
        this.contacts = contacts;
    }
    public int getiDCommission() {
        return iDCommission;
    }
    public void setiDCommission(int iDCommission) {
        this.iDCommission = iDCommission;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getContacts() {
        return contacts;
    }
    public void setContacts(String contacts) {
        this.contacts = contacts;
    }
}