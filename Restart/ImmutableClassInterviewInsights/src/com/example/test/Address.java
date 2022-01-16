package com.example.test;

public class Address {

    private String state;
    private String city;
    private String country;

    public Address(String state, String city, String country) {
        this.state = state;
        this.city = city;
        this.country = country;
    }

    public Address(Address address) {
        this(address.getCity(), address.getState(), address.getCountry());
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
