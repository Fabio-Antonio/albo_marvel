package com.test.albo.marvel.model.Comics;

public class CreatorsItem {
    private String resourceURI;
    private String name;
    private String role;

    public String getResourceURI() {
        return resourceURI;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    @Override
    public String toString() {
        return "Items{" +
                "resourceURI='" + resourceURI + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
