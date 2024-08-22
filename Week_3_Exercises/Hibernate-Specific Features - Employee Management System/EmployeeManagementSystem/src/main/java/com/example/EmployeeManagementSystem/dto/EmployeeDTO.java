package com.example.EmployeeManagementSystem.dto;

public class EmployeeDTO {
	private String name;
    private String email;

    public EmployeeDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{name='" + name + '\'' + ", email='" + email + '\'' + '}';
    }
}