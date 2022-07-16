package org.example;

public class User {
    private Contact contact;
    private Address address;
    private String password;

    public User(Contact contact, Address address, String password) {
        this.contact = contact;
        this.address = address;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "contact=" + contact +
                ", address=" + address +
                ", password='" + password + '\'' +
                '}';
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
