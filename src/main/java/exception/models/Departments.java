package exception.models;

import java.util.Objects;

public class Departments {

    private String name;
    private String address;
    private String phone;
    private String website;
    private String email;
    private int id;

    public Departments(String name, String address, String zipcode, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public Departments(String name, String address, String phone, String website, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.website = website;
        this.email = email;
    }

    public Departments(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.website = "no website listed";
        this.email = "no email available";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departments)) return false;
        Departments that = (Departments) o;
        return id == that.id &&
                getName().equals(that.getName()) &&
                address.equals(that.address) &&
                phone.equals(that.phone) &&
                website.equals(that.website) &&
                email.equals(that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), address, phone, website, email, id);
    }

    public void setId(int id) {
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

    public int getId() {
        return id;
    }
}