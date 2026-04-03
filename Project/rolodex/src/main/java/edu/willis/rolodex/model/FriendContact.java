package edu.willis.rolodex.model;


public class FriendContact extends Contact {

    public FriendContact() {}

    public FriendContact(String first, String last, String phone, Address addr) {
        super(first, last, phone, addr);
    }

    @Override
    public String getType() {
        return "Friend";
    }
}