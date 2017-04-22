package com.bek_qa.addressbook.model;

public class ContactData {
    private final String fName;
    private final String lName;
    private final String street;
    private final String cityStZip;
    private final String cellNumber;
    private final String eMail;

    public ContactData(String fName, String lName, String street, String cityStZip, String cellNumber, String eMail) {
        this.fName = fName;
        this.lName = lName;
        this.street = street;
        this.cityStZip = cityStZip;
        this.cellNumber = cellNumber;
        this.eMail = eMail;
    }
    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getStreet() {
        return street;
    }

    public String getCityStZip() {
        return cityStZip;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public String geteMail() {
        return eMail;
    }
}
