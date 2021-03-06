package internet_store.domain;

import java.util.Objects;

public class Customer {

    private long id;
    private String name;
    private String surname;
    private int phoneNumber;
    private String address;
    private String email;

    public Customer(String name, String surname, int phoneNumber, String address, String email) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return phoneNumber == customer.phoneNumber &&
                Objects.equals(name.toLowerCase(), customer.name.toLowerCase()) &&
                Objects.equals(surname.toLowerCase(), customer.surname.toLowerCase()) &&
                Objects.equals(address.toLowerCase(), customer.address.toLowerCase()) &&
                Objects.equals(email.toLowerCase(), customer.email.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, phoneNumber, address, email);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
