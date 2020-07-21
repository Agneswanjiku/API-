package models;
public class Departments {
    private String name;
    private String description;
    private int employes;

    public Departments(String name, String description, int employes) {
        this.name = name;
        this.description = description;
        this.employes = employes;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getEmployes() {
        return employes;
    }
}
