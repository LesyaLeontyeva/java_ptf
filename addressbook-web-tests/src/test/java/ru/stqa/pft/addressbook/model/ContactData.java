package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String firstname;
    private final String lastname;
    private final String company;
    private final String email;
    private final String mobile;

    public ContactData(String firstname, String lastname, String company, String email, String mobile) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.company = company;
        this.email = email;
        this.mobile = mobile;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCompany() {
        return company;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }
}
