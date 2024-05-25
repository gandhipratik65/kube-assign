package com.employee.backend;

/**
 * This class defines the attribute of Employee class.
 */
public class Employee {

    private String name;
    private String address;
    private String education;

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final String getAddress() {
        return address;
    }

    public final void setAddress(String address) {
        this.address = address;
    }

    public final String  getEducation() {
        return this.education;
    }

    public final void setEducation(String education) {
        this.education = education;
    }
}
