package edu.willis.rolodex.model;


public class BusinessContact extends Contact {

    public BusinessContact() {}

    public BusinessContact(String first, String last, String phone, Address addr) {
        super(first, last, phone, addr);
    }

    @Override
    public String getType() {
        return "Business";
    }
}