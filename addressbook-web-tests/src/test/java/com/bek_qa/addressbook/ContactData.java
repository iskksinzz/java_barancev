package com.bek_qa.addressbook;

public class ContactData {
    private final String fName;
    private final String lName;
    private final String companyName;
    private final String address;
    private final String suite;
    private final String cityStateZip;
    private final String workPhone;
    private final String email;

    public ContactData(String fName, String lName, String companyName, String address, String suite, String cityStateZip, String workPhone, String email) {
        this.fName = fName;
        this.lName = lName;
        this.companyName = companyName;
        this.address = address;
        this.suite = suite;
        this.cityStateZip = cityStateZip;
        this.workPhone = workPhone;
        this.email = email;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAddress() {
        return address;
    }

    public String getSuite() {
        return suite;
    }

    public String getCityStateZip() {
        return cityStateZip;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public String getEmail() {
        return email;
    }
}
