package com.yankus;

import org.json.JSONArray;
import org.json.JSONObject;
import java.util.HashSet;

public class CustomerSet {
    private JSONObject jsonCustomerList;
    private HashSet<Customer> customers = new HashSet();

    public CustomerSet (JSONObject customerList) {
        this.jsonCustomerList = customerList;
        loadCustomerData();

    }

    public HashSet<Customer> getCustomers () {

        return customers;
    }

    private void loadCustomerData() {

        JSONObject addressBook = (JSONObject) jsonCustomerList.get("AddressBook");
        JSONArray contacts = (JSONArray) addressBook.get("Contact");

        for(int i = 0; i<contacts.length(); i++) {

            JSONObject contact = contacts.getJSONObject(i);
            Object fax;
            Object postalCode;
            if (contact.isNull("fax")) {
                fax = "";
                System.out.println("Warning: CustomerID: "+contact.get("CustomerID")+ " is missing fax.");
            } else {
                fax = contact.get("Fax");
            }
            if (contact.isNull("PostalCode")) {
                postalCode = "";
                System.out.println("Warning: CustomerID: "+contact.get("CustomerID")+" is missing postal code.");
            } else {
                postalCode = contact.get("PostalCode");
            }

            System.out.println(contact);
            customers.add(new Customer(contact.get("CustomerID"), contact.get("CompanyName"), contact.get("ContactName"),
                    contact.get("ContactTitle"), contact.get("Address"), contact.get("City"), contact.get("Email"),
                    postalCode, contact.get("Country"), contact.get("Phone"), fax));


        }

        System.out.println("Loaded " + customers.size() + " customers.");

    }

}
