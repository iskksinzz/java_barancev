package com.bek_qa.addressbook.model;

public class ContactData {
    private final String fName;
    private final String lName;
    private String group;

    public ContactData(String fName, String lName, String group) {
        this.fName = fName;
        this.lName = lName;
        this.group = group;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getGroup() {
        return group;
    }
}
