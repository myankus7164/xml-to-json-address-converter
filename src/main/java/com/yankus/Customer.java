package com.yankus;

public class Customer {
    private String customerID;
    private String companyName;
    private String contactName;
    private String contactTitle;
    private String address;
    private String city;
    private String email;
    private String postalCode;
    private String country;
    private String phone;
    private String fax;

    public Customer (Object customerID, Object companyName, Object contactName, Object contactTitle, Object address,
                     Object city, Object email, Object postalCode, Object country, Object phone, Object fax) {

        this.customerID = customerID.toString();
        this.companyName = companyName.toString();
        this.contactName = contactName.toString();
        this.contactTitle = contactTitle.toString();
        this.address = address.toString();
        this.city = city.toString();
        this.email = email.toString();
        this.postalCode = postalCode.toString();
        this.country = country.toString();
        this.phone = phone.toString();
        this.fax = fax.toString();


    }

}
