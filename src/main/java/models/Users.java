package models;

import java.util.Objects;

public class Users {
    private String position;
    private String roles;
    private String employes;
    private int id;

    public Users(String position, String role, String employes) {
        this.position = position;
        this.roles = roles;
        this.employes = employes;
    }

    public static int setId(int id) {
        return id;
    }

    public String getName() {

        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Users)) return false;
        Users users = (Users) o;
        return employes == users.employes &&
                position.equals(users.position) &&
                roles.equals(users.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, roles, employes);
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public String getAbout() {

        return roles;
    }

    public int getId() {
        return id;
    }

    public String getroles() {
        return roles;
    }
}
