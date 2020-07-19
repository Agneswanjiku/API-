package models;
public class Users {
    private String position;
    private String roles;
    private int employes;

    public Users(String position, String role, int employes) {
        this.position = position;
        this.roles = roles;
        this.employes = employes;
    }

    public String getName() {
        return position;
    }

    public String getAbout() {
        return roles;
    }

    public int getBirthYear() {
        return employes;
    }
}
